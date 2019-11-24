import java.util.Scanner;

public class Main {
    private static int numberOfPlayers = 0;
    private static int startBalance = 0;
    private static Player[] players;
    private static Shaker shaker;
    private static ChanceDeck chanceDeck;
    private static Scanner scan;




    public static void main(String[] args) {
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
                    break;
            }
        }
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Spiller indtast dit navn");

            players[i] = new Player(startBalance);
            System.out.println("Navn " + players[i].playerName + "\nBalance: " + players[i].account.balance);
            //brik.brikSelect();
        }

       initVars();

        Felter felter = new Felter();

        boolean playing = true;
        while (playing) {
            for (Player player : players) {
                System.out.println("Tryk 1 for at rulle terningerne " + player.toString());
                String valg = scan.nextLine();

               if (valg.equals("1")) {
                    int val = shaker.rollDice(player);

                   player.currentFelt += val;

                    if (player.currentFelt >= 24) {
                        player.currentFelt -= 24;
                        System.out.println(player.toString() + " lander på felt " + player.currentFelt);
                        player.account.balance += 2;

                        System.out.println(player.playerName + " har passeret START og modtager 2M" + "\n"
                        + player.playerName + " nuværende balance: " + player.account.balance);
                        isOwned(felter,player);
                        chancekort(player);

                    } else
                        isOwned(felter,player);
                        chancekort(player);

                        if (player.account.balance <= 0) {
                        playing = false;
                        break;
                    }
                }

            }
        }
    }

    private static void isOwned(Felter felter, Player player) {
        Felt felt = felter.felt[player.currentFelt];
        Player owner = felt.getOwner();


        if (!felt.owned && player.currentFelt != 3 && player.currentFelt != 9 && player.currentFelt != 15 && player.currentFelt != 21 && player.currentFelt !=0 &&
                player.currentFelt !=6 && player.currentFelt !=12 && player.currentFelt !=18) {
            felt.setOwner(player);
            player.account.updateBalance(- felt.p);
            System.out.println("Du lander på felt " + player.currentFelt + " og køber " + felt.n + " for " + felt.p + " millioner");
            System.out.println(player.playerName + " nuværende balance: " + player.account.balance);
        }
        else if (owner != player && player.currentFelt != 3 && player.currentFelt != 9 && player.currentFelt != 15 && player.currentFelt != 21 && player.currentFelt !=0 &&
                player.currentFelt !=6 && player.currentFelt !=12 && player.currentFelt !=18) {
            player.account.updateBalance(- felt.p);
            owner.account.updateBalance(felt.p);
            System.out.println("Du lander på felt " + felt.n + "\n" + "Nuværende ejer: " + owner.playerName +
                    "\n" + player.playerName + " betaler " + owner.playerName + " "+ felt.p + " millioner");
            System.out.println(player.playerName + " nuværende balance: " + player.account.balance);
            System.out.println(owner.playerName + " nuværende balance: " + owner.account.balance);
        } else
            System.out.println("Du lander på felt " + player.currentFelt + "\n" + felt.n);

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
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        numberOfPlayers = Integer.parseInt(input);
    }
}
