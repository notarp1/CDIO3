import java.util.Scanner;

public class Main {
    private static int numberOfPlayers = 0;
    private static int startBalance = 0;
    private static Player[] players;

    public static void main(String[] args) {
        // Hent antallet af spillere og sæt start-balancen ud fra det
        // Sikrer også at der kun kan spilles med et godkendt antal spillere
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
                    break;
            }
        }

        // Opret spillerne
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Spiller indtast dit navn");
            players[i] = new Player(startBalance);
            System.out.println("Navn " + players[i].playerName + "\nBalance: " + players[i].balance);
        }

        Shaker shaker = new Shaker();

        ChanceDeck chanceDeck = new ChanceDeck();
        chanceDeck.shuffle();

        Scanner scan = new Scanner(System.in);

        boolean playing = true;
        while (playing) {
            for (Player player : players) {
                System.out.println("Tryk 1 for at rulle terningerne " + player.toString());
                String valg = scan.nextLine();
                if (valg.equals("1")) {
                    shaker.rollDice();

                    player.currentFelt = shaker.die1.getFaceValue() + player.previousFelt;
                    player.previousFelt = player.currentFelt;

                    if (player.previousFelt > 24) {
                        player.restFelt = player.previousFelt - 24;
                        player.previousFelt = player.restFelt;
                        player.currentFelt = player.previousFelt;
                    }
                    System.out.println(player.toString() + " lander på felt " + player.currentFelt);
                    chancekort(player, chanceDeck);
                }
                if (player.balance <= 0) {
                    playing = false;
                    break;
                }
            }
        }
    }

    private static void chancekort(Player player, ChanceDeck chanceDeck) {
        if (player.currentFelt == 4 || player.currentFelt == 10 || player.currentFelt == 16 || player.currentFelt == 22) {
            System.out.println("____________________ \n CHANCEKORT \n____________________ \n");
            System.out.println(chanceDeck.draw().toString());
            System.out.println("");
        }
    }

    private static void getNumberOfPlayers(){
        System.out.println("Indtast ønskede antal spillere");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        numberOfPlayers = Integer.parseInt(input);
    }
}
