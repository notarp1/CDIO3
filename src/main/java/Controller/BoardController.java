package Controller;

import Model.*;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.util.Scanner;

public class BoardController {
    private static int numberOfPlayers = 0;
    private static int startBalance = 0;
    private static Player[] players;
    private static Shaker shaker;
    private static ChanceDeck chanceDeck;
    private static Scanner scan;
    private static GUI gui;
    private static GUI_Player[] playergui;




    public BoardController(){

        //GUI gui = new GUI();
        //gui.getFields();

       // GUI_Car a = new GUI_Car(Color.BLUE, WHITE, GUI_Car.Type.CAR, GUI_Car.Pattern.FILL);

        Felter felter = new Felter();
        createGUIFromFields(felter.felt);

        Brik brik = new Brik();
        while (startBalance == 0) {
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
        playergui = new GUI_Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Spiller indtast dit navn");
            players[i] = new Player(startBalance);
            players[i].playerName = gui.getUserString("Indtast dit navn");                                          //GUI

            System.out.println("Navn " + players[i].playerName + "\nBalance: " + players[i].account.balance);
            gui.showMessage("Navn " + players[i].playerName + "\nBalance: " + players[i].account.balance);          //GUI

            GUI_Player playercar = new GUI_Player(players[i].playerName, players[i].account.balance, new GUI_Car());     //GUI

            playergui[i]=playercar;                                                                                      //GUI
            //brik.brikSelect();

        }


        initVars();


        boolean playing = true;
        while (playing) {

            for (int i = 0; i < players.length; i++) {
                Player player = players[i];
                GUI_Player guiPlayer = playergui[i];

                System.out.println("Tryk 1 for at rulle terningerne " + player.toString());
               gui.getUserButtonPressed("Tyk enter for at slå", "SLÅ");

                    int val = shaker.rollDice(player);
                    gui.setDie(val);
                   player.previousFelt = player.currentFelt;
                   player.currentFelt += val;



                    if (player.currentFelt >= 24) {
                        player.currentFelt -= 24;

                        gui.getFields()[player.previousFelt].setCar(guiPlayer, false);
                        gui.getFields()[player.currentFelt].setCar(guiPlayer, true);
                        System.out.println(player.toString() + " lander på felt " + player.currentFelt);
                        gui.showMessage(player.toString() + " lander på felt " + player.currentFelt + "\n" + player.playerName + "nuværende balance er" + player.account.balance);

                        player.account.balance += 2;

                        System.out.println(player.playerName + " har passeret START og modtager 2M" + "\n"
                        + player.playerName + " nuværende balance: " + player.account.balance);
                        gui.showMessage(player.playerName + " har passeret START og modtager 2M" + "\n"
                                + player.playerName + " nuværende balance: " + player.account.balance);

                        isOwned(felter,player);
                        chancekort(player);


                    } else if (player.currentFelt == 18){
                        player.currentFelt=6;
                        player.account.balance -= 2;

                        gui.getFields()[player.previousFelt].setCar(guiPlayer, false);
                        gui.getFields()[player.currentFelt].setCar(guiPlayer, true);

                    }

                       gui.getFields()[player.previousFelt].setCar(guiPlayer, false);
                       gui.getFields()[player.currentFelt].setCar(guiPlayer, true);
                        isOwned(felter,player);
                        chancekort(player);

                        if (player.account.balance <= 0) {
                        playing = false;
                        break;
                    }


                }

            }


        }


    private static void createGUIFromFields(Felt[] felter) {

        GUI_Field[] gui_fields = new GUI_Field[felter.length];
        for (int i = 0; i < felter.length; i++) {
            GUI_Field field = new GUI_Street();
            Felt felt = felter[i];
            field.setTitle(felt.n);
            field.setBackGroundColor(felt.f);
            field.setSubText(String.valueOf(felt.p));
            gui_fields[i] = field;
        }
        gui = new GUI(gui_fields);

    }

    private static void isOwned(Felter felter, Player player) {
        Felt felt = felter.felt[player.currentFelt];
        Player owner = felt.getOwner();


        if (!felt.owned && player.currentFelt != 3 && player.currentFelt != 9 && player.currentFelt != 15 && player.currentFelt != 21 && player.currentFelt !=0 &&
                player.currentFelt !=6 && player.currentFelt !=12 && player.currentFelt !=18) {
            felt.setOwner(player);
            player.account.updateBalance(- felt.p);
            System.out.println(player.playerName + " lander på felt " + player.currentFelt + " og køber " + felt.n + " for " + felt.p + " millioner");
            System.out.println(player.playerName + " nuværende balance: " + player.account.balance);

            gui.showMessage(player.playerName + " lander på felt " + player.currentFelt + " og køber " + felt.n + " for " + felt.p + " millioner" + "\n" + player.playerName + " nuværende balance: " + player.account.balance);
        }
        else if (owner != player && player.currentFelt != 3 && player.currentFelt != 9 && player.currentFelt != 15 && player.currentFelt != 21 && player.currentFelt !=0 &&
                player.currentFelt !=6 && player.currentFelt !=12 && player.currentFelt !=18) {
            player.account.updateBalance(- felt.p);
            owner.account.updateBalance(felt.p);
            System.out.println(player.playerName + " lander på felt " + felt.n + "\n" + "Nuværende ejer: " + owner.playerName +
                    "\n" + player.playerName + " betaler " + owner.playerName + " "+ felt.p + " millioner");
            System.out.println(player.playerName + " nuværende balance: " + player.account.balance);
            System.out.println(owner.playerName + " nuværende balance: " + owner.account.balance);

            gui.showMessage(player.playerName + " lander på felt " + felt.n + "\n" + "Nuværende ejer: " + owner.playerName +
                    "\n" + player.playerName + " betaler " + owner.playerName + " "+ felt.p + " millioner" + "\n" + player.playerName + " nuværende balance: " + player.account.balance +
                    "\n" + owner.playerName + " nuværende balance: " + owner.account.balance);
        } else if (player.currentFelt == 3 || player.currentFelt == 9 || player.currentFelt == 15 || player.currentFelt == 21 || player.currentFelt ==0 ||
                player.currentFelt ==6 || player.currentFelt ==12 || player.currentFelt ==18) {
            System.out.println("Du lander på felt " + player.currentFelt + "\n" + felt.n);
            gui.showMessage("Du lander på felt " + player.currentFelt + "\n" + felt.n);
        }
    }


    private static void initVars() {

        shaker = new Shaker();
        chanceDeck = new ChanceDeck();
        chanceDeck.shuffle();
        scan = new Scanner(System.in);

    }


    private static void chancekort(Player player) {
        if (player.currentFelt == 3 || player.currentFelt == 9 || player.currentFelt == 15 || player.currentFelt == 21) {
            System.out.println("____________________ \n CHANCEKORT \n____________________ \n");
            System.out.println(chanceDeck.draw().toString());
            System.out.println("");
        }
    }

    private static void getNumberOfPlayers(){
        System.out.println("Indtast ønskede antal spillere");

        numberOfPlayers = gui.getUserInteger("Indstast ønskede antal spillere");
    }
}
