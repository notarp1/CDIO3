package Controller;

import Model.*;
import Model.ChanceCards.Kort;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class    BoardController {
    private static int numberOfPlayers = 0;
    private static int startBalance = 0;
    private static Player[] players;
    private static Shaker shaker;
    private static ChanceDeck chanceDeck;
    private static GUI gui;
    private static Brik brik;
    private static Felter felter;
    private static GUI_Player[] playergui;

    public BoardController(){
        initVars();

        boolean playing = true;
        while (playing) {
            for (Player player : players) {
                playing = handleRound(player);
                if(!playing)
                    break;
            }
        }
        findWinners();
        System.exit(0);
    }

    private static boolean handleRound(Player player) {
        gui.displayChanceCard("");
        // Hvis spilleren er i fængsel, skal de først betale for at komme ud, med mindre de har det rigtige kort
        handleGetOutOfJail(player);

        // Slå med terningen når spilleren trykker
        gui.getUserButtonPressed(player + ", tryk enter/knappen for at slå", "SLÅ");

        // Vis resultatet og opdater felt
        int val = shaker.rollDice();
        gui.setDie(val);
        player.move(val);

        // Hvis spilleren lander på et felt over felt 23, så starter de forfra på  brættet
        handlePassStart(player);

        handleGetInJail(player);

        // Håndter chancekort før et felt der kan ejes, da det kan ske at man bliver flyttet over til et
        handleChancekort(player);
        handleOwnable(player);

        handlePassiveStops(player);

        return player.account.balance > 0;
    }

    private static void handleGetOutOfJail(Player player) {
        if(player.currentFelt == 6 && player.previousFelt == 18) {
            if(player.getJailPass()) {
                gui.getUserButtonPressed("Du er i fængsel, men har et frikort, så du kommer fri", "OK");
                player.setJailPass(false);
            } else {
                gui.getUserButtonPressed("Du er i fængsel og betaler 1M for at komme ud", "OK");
                player.updateBalance(-1);
            }
        }
    }
    
    private static void handleGetInJail(Player player) {
        if(player.currentFelt == 18) {
            player.moveTo(6);

            gui.getUserButtonPressed("Du er røget i fængsel!", "ØV");
        }
    }

    private static void handlePassStart(Player player) {
        if (player.passedStart) {
            gui.getUserButtonPressed(player + " passerer start og modtager 2M", "OK");
            player.updateBalance(2);
            player.passedStart = false;
        }
    }

    private static void handlePassiveStops(Player player) {
        if(player.currentFelt == 6 && player.previousFelt != 18) {
            gui.getUserButtonPressed("Du tager på besøg i fængslet", "OK");
        } else if(player.currentFelt == 12) {
            gui.getUserButtonPressed("Du parkerer gratis til næste tur", "OK");
        }
    }

    private static void handleOwnable(Player player) {
        Felt felt = felter.felt[player.currentFelt];
        
        if(!felt.owned && felt.ownable) {
            felt.setOwner(player);
            if(!player.hasFreeBee()) {
                player.updateBalance(-felt.pris);
                gui.getUserButtonPressed(player + " lander på og køber " + felt + " for " + felt.pris + "M", "OK");
            } else {
                gui.getUserButtonPressed(player + " lander på og får " + felt, "OK");
            }
        } else if(felt.owned && felt.ownable) {
            Player owner = felt.getOwner();
            if(owner != player) {
                // Finder ud af om det andet felt af samme farve er ejet af den samme person
                Felt nabo = felter.felt[0];
                if(player.currentFelt == 23) {
                    nabo = felter.felt[22];
                } else {
                    for (int i = -1; i < 2; i += 2) {
                        if (felter.felt[player.currentFelt + i].ownable) {
                            nabo = felter.felt[player.currentFelt + i];
                        }
                    }
                }
                // Hvis naboen har den samme ejer skal prisen være det dobbelte
                int pris = felt.pris;
                if(nabo != null) {
                    if(nabo.getOwner() == owner) {
                        pris = pris * 2;
                    }
                }
                player.updateBalance(-pris);
                owner.updateBalance(pris);

                gui.getUserButtonPressed(player + " landede på felt " + felt + ", som er ejet af " + owner + ", og betaler " + pris + "M", "OK");
            } else {
                gui.getUserButtonPressed("Du landede på et felt du allerede ejer", "OK");
            }
        }
        // Fjern spillerens "GRATIS FELT", da det ikke er noget der kan gemmes
        player.useFreeBee();
    }

    private static void handleChancekort(Player player) {
        if(felter.felt[player.currentFelt].navn.equals("CHANCE")) {
            Kort chanceKort = chanceDeck.draw();
            // Håndterer chancekortet, 11 er speciel, da den kræver væsentlig flere informationer end alle de andre
            if(chanceKort.getCardNumber() == 11) {
                player.updateBalance(numberOfPlayers-1);
                for(Player other : players) {
                    if(player != other) {
                        other.updateBalance(-1);
                    }
                }
            }
            chanceKort.action(player, gui);
        }
    }

    private static void findWinners() {
        int highestScore = 0;
        int winners = 0;
        for(Player player : players) {
            if(highestScore < player.account.balance) {
                highestScore = player.account.balance;
                winners = 1;
            } else if(highestScore == player.account.balance) {
                winners++;
            }
        }
        StringBuilder msg = new StringBuilder();
        if(winners > 1) {
            msg = new StringBuilder("Der er flere vindere!\nTillykke til:\n");
        } else {
            msg = new StringBuilder("Tillykke til ");
        }
        for(Player player : players) {
            if(player.account.balance == highestScore) {
                msg.append(player);
                if(winners > 1) {
                    msg.append("\n");
                }
            }
        }
        System.out.println(String.valueOf(msg));
        gui.showMessage(String.valueOf(msg));
    }

    private static void initVars() {
        felter = new Felter();
        createGUIFromFields(felter.felt);

        brik = new Brik();
        shaker = new Shaker();
        chanceDeck = new ChanceDeck();
        chanceDeck.shuffle();

        while (startBalance == 0) {
            setStartbalance();
        }

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Spiller indtast dit navn");
            players[i] = new Player(gui, startBalance);

            gui.showMessage("Navn: " + players[i].playerName + "\nStart-balance: " + players[i].account.balance);
        }
    }

    private static void createGUIFromFields(Felt[] felter) {
        GUI_Field[] gui_fields = new GUI_Field[felter.length];
        for (int i = 0; i < felter.length; i++) {
            GUI_Field field = new GUI_Street();
            Felt felt = felter[i];
            field.setTitle(felt.navn);
            field.setBackGroundColor(felt.farve);
            field.setSubText(String.valueOf(felt.pris));
            gui_fields[i] = field;
        }
        gui = new GUI(gui_fields);
    }

    private static void getNumberOfPlayers(){
        System.out.println("Indtast ønskede antal spillere");

        numberOfPlayers = gui.getUserInteger("Indstast ønskede antal spillere", 2, 4);
    }

    private static void setStartbalance() {
        getNumberOfPlayers();
        players = new Player[numberOfPlayers];
        switch (numberOfPlayers) {
            case 2:
                startBalance = 20;
                break;
            case 3:
                startBalance = 18;
                break;
            case 4:
                startBalance = 16;
                break;
            default:
                System.out.println("Det var ikke et understøttet antal spillere.");
                gui.showMessage("Det var ikke et understøttet antal spillere");
                break;
        }
    }
}
