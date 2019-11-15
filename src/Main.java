import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean antalSpillereOK = false;
        NumberOfPlayers playerNumber = new NumberOfPlayers();

        Player[] player = new Player[playerNumber.numberOfPlayers];


        while (!antalSpillereOK) {

            for (int i = 0; i < playerNumber.numberOfPlayers; i++) {

                if (playerNumber.numberOfPlayers == 2) {

                    System.out.println("Spiller indtast dit navn");
                    player[i] = new Player(20);
                    System.out.println("Navn " + player[i].playerName);
                    antalSpillereOK = true;
                } else if (playerNumber.numberOfPlayers == 3) {

                    System.out.println("Spiller indtast dit navn");
                    player[i] = new Player(18);
                    System.out.println("Navn " + player[i].playerName);
                    antalSpillereOK = true;
                } else if (playerNumber.numberOfPlayers == 4) {

                    System.out.println("Spiller indtast dit navn");
                    player[i] = new Player(16);
                    System.out.println("Navn " + player[i].playerName);
                    antalSpillereOK = true;

                }
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

                    if (player[i].previousFelt > 24) {

                        player[i].restFelt = player[i].previousFelt - 24;
                        player[i].previousFelt = 0 + player[i].restFelt;
                        player[i].currentFelt = player[i].previousFelt;
                        System.out.println(player[i].toString() + " lander på felt " + player[i].currentFelt);
                        if (player[i].currentFelt == 4 || player[i].currentFelt == 10 || player[i].currentFelt == 16 || player[i].currentFelt == 22) {

                            System.out.println(daek.traekkort().toString());

                        }
                    } else
                        System.out.println(player[i].toString() + " lander på felt " + player[i].currentFelt);
                    if (player[i].currentFelt == 4 || player[i].currentFelt == 10 || player[i].currentFelt == 16 || player[i].currentFelt == 22) {

                        System.out.println(daek.traekkort().toString());

                    }

                }

            }


        }



    }
}
