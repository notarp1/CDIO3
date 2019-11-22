import java.awt.*;

public class Felter {
// skal nok laves om til arrays, FARVE[], PRIS[], NAVN[]

    char farve;
    int pris;
    String navn;

    private static Felt[] felt;

    Felter() {
        felt = new Felt[24];

    }


    public void Felter() {

        for (int i = 0; i < 24; i++) {

            switch (i) {

                // HVID = 'A', BRUN = 'B', LYSEBLÅ = C, PINK = D, ORANGE = E, RØD = F, GUL = G, GRØN= H, BLÅ = I

                case 0:
                    farve = 'A';
                    pris = 0;
                    navn = "Start";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.WHITE, 0, "Start");
                    break;
                case 1:
                    farve = 'B';
                    pris = 1;
                    navn = "Burger Baren";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.DARK_GRAY, 1,"Burger Baren");
                    break;
                case 2:
                    farve = 'B';
                    pris = 1;
                    navn = "Pizzariaet";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.DARK_GRAY, 1, "Pizzariaet");
                    break;
                case 3:
                    farve = 'A';
                    pris = 0;
                    navn = "CHANCE";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    break;
                case 4:
                    farve = 'C';
                    pris = 1;
                    navn = "Slikbutikken";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.CYAN, 1,"Slikbutikken");
                    break;
                case 5:
                    farve = 'C';
                    pris = 1;
                    navn = "Iskiosken";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.CYAN, 1, "Iskiosken");
                    break;
                case 6:
                    farve = 'A';
                    pris = 0;
                    navn = "PÅ BESØG I FÆNGSEL";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.WHITE, 0,"PÅ BESØG I FÆNGSEL");
                    break;
                case 7:
                    farve = 'D';
                    pris = 2;
                    navn = "Museet";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.PINK, 2, "Museet");
                    break;
                case 8:
                    farve = 'D';
                    pris = 2;
                    navn = "Biblioteket";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.PINK, 2, "Biblioteket");
                    break;
                case 9:
                    farve = 'A';
                    pris = 0;
                    navn = "CHANCE";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    break;
                case 10:
                    farve = 'E';
                    pris = 2;
                    navn = "Skaterparken";
                    System.out.println("Du lander på " + navn);

                    felt[i] = new Felt(Color.ORANGE, 2, "Skaterparken");
                    break;
                case 11:
                    farve = 'E';
                    pris = 2;
                    navn = "Swimmingpoolen";
                    System.out.println("Du lander på " + navn);
                    felt[i] = new Felt(Color.ORANGE, 2, "Swimmingpoolen");
                    break;
                case 12:
                    felt[i] = new Felt(Color.WHITE, 0, "GRATIS PARKERING");
                    System.out.println(felt[i].n);
                    break;
                case 13:
                    felt[i] = new Felt(Color.RED, 3, "Spillehallen");
                    System.out.println(felt[i].n);
                    break;
                case 14:
                    felt[i] = new Felt(Color.RED, 3, "Biografen");
                    System.out.println(felt[i].n);
                    break;
                case 15:
                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    System.out.println(felt[i].n);
                    break;
                case 16:
                    felt[i] = new Felt(Color.YELLOW, 3, "Legetøjsbutikken");
                    System.out.println(felt[i].n);
                    break;
                case 17:
                    felt[i] = new Felt(Color.YELLOW, 3, "Dyrehandlen");
                    System.out.println(felt[i].n);
                    break;
                case 18:
                    felt[i] = new Felt(Color.WHITE, 0, "GÅ I FÆNGSEL");
                    System.out.println(felt[i].n);
                    break;
                case 19:
                    felt[i] = new Felt(Color.GREEN, 4, "Bowlinghallen");
                    System.out.println(felt[i].n);
                    break;
                case 20:
                    felt[i] = new Felt(Color.GREEN, 4, "Zoo");
                    System.out.println(felt[i].n);
                    break;
                case 21:
                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    System.out.println(felt[i].n);
                    break;
                case 22:
                    felt[i] = new Felt(Color.BLUE, 5, "Vandlandet");
                    System.out.println(felt[i].n);
                    break;
                case 23:
                    felt[i] = new Felt(Color.BLUE, 5, "Strandpromenaden");
                    System.out.println(felt[i].n);
                    break;

            }
        }
    }
}
