import gui_main.GUI;

import java.util.Scanner;

public class Main {
    private static int numberOfPlayers = 0;
    private static int startBalance = 0;
    private static Player[] players;
    private static Shaker shaker;
    private static ChanceDeck chanceDeck;
    private static Scanner scan;
    private static GUI gui;

    public static void main(String[] args) {
        initVars();
        startGame();

        boolean playing = true;
        while (playing) {
            for (Player player : players) {
                playing = playRound(player);
                if(!playing) {
                    break;
                }
            }
        }
    }

    private static void chancekort(Player player, ChanceDeck chanceDeck) {
        if (player.currentField == 4 || player.currentField == 10 || player.currentField == 16 || player.currentField == 22) {
            System.out.println("____________________ \n CHANCEKORT \n____________________ \n");
            System.out.println(chanceDeck.draw().toString());
            System.out.println("");
        }
    }

    private static void getNumberOfPlayers() {
        numberOfPlayers = gui.getUserInteger("Indtast ønskede antal spillere");
    }

    private static void setStartBalance() {
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
                break;
        }
    }

    private static void initVars() {
        gui = new GUI();

        shaker = new Shaker();

        chanceDeck = new ChanceDeck();
        chanceDeck.shuffle();

        scan = new Scanner(System.in);
    }

    private static void startGame() {
        // Hent antallet af spillere og sæt start-balancen ud fra det
        // Sikrer også at der kun kan spilles med et godkendt antal spillere
        while (startBalance == 0) {
            getNumberOfPlayers();
            players = new Player[numberOfPlayers];
            setStartBalance();
        }

        // Opret spillerne
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(gui, startBalance);
            System.out.println("Navn " + players[i].getPlayerName() + "\nBalance: " + players[i].account.getBalance());
        }
    }

    private static boolean playRound(Player player) {
        gui.getUserButtonPressed("Rul terningen", "Rul");

        int val = shaker.rollDice();
        gui.setDie(val);

        player.currentField += val;
        if (player.currentField > 24)
            player.currentField -= 24;
        System.out.println(player.toString() + " lander på felt " + player.currentField);

        chancekort(player, chanceDeck);

        return player.account.getBalance() > 0;
    }
}
