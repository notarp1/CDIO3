import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        NumberOfPlayers playerNumber = new NumberOfPlayers();
        Player[] player = new Player[playerNumber.numberOfPlayers];

        if (playerNumber.numberOfPlayers == 2) {
            for (int i = 0; i < playerNumber.numberOfPlayers; i++) {

                System.out.println("Spiller indtast dit navn");
                player[i] = new Player(20);
                System.out.println("Navn " + player[i].playerName + "\nBalance: " + player[i].balance);
            }
        } else if (playerNumber.numberOfPlayers == 3) {
            for (int i = 0; i < playerNumber.numberOfPlayers; i++) {

                System.out.println("Spiller indtast dit navn");
                player[i] = new Player(18);
                System.out.println("Navn " + player[i].playerName + "\nBalance: " + player[i].balance);
            }
        } else if (playerNumber.numberOfPlayers >= 4) {
                for (int i = 0; i < playerNumber.numberOfPlayers; i++) {

                    System.out.println("Spiller indtast dit navn");
                    player[i] = new Player(18);
                    System.out.println("Navn: " + player[i].playerName + "\nBalance: " + player[i].balance);
                }
            }

        Shaker shaker;
        shaker = new Shaker();

        Daek daek = new Daek();
        daek.blandkort();


        Scanner scan = new Scanner(System.in);

        while(true){


            for (int i = 0; i < playerNumber.numberOfPlayers; i++) {

                System.out.println("Tryk 1 for at rulle terningerne " + player[i]);
                String valg = scan.nextLine();
                if (valg.equals("1")) {

                    shaker.rollDice();

                    player[i].currentFelt = shaker.die1.getFaceValue() + player[i].previousFelt;
                    player[i].previousFelt = player[i].currentFelt;
                    System.out.println(player[i].toString() + " lander på felt " + player[i].currentFelt);

                    if (player[i].previousFelt > 24) {

                        player[i].restFelt = player[i].previousFelt - 24;
                        player[i].previousFelt = 0 + player[i].restFelt;
                        player[i].currentFelt = player[i].previousFelt;
                        System.out.println(player[i].toString() + " lander på felt " + player[i].currentFelt);

                        chancekort(player, daek, i);

                    } else chancekort(player, daek, i);


                }

            }


        }



    }

    private static void chancekort(Player[] player, Daek daek, int i) {
        if (player[i].currentFelt == 4 || player[i].currentFelt == 10 || player[i].currentFelt == 16 || player[i].currentFelt == 22) {
            System.out.println("____________________ \n CHANCEKORT \n____________________ \n");
            System.out.println(daek.traekkort().toString());
            System.out.println("");

        }
    }
}
