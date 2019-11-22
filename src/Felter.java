import java.awt.*;

public class Felter {
    private static Felt[] felt;

    Felter() {
        felt = new Felt[24];
    }

    public void Felter() {

        for (int i = 0; i < 24; i++) {

            switch (i) {

                case 0:
                    felt[i] = new Felt(Color.WHITE, 0, "Start");
                    System.out.println(felt[i].n);
                    break;
                case 1:
                    felt[i] = new Felt(Color.DARK_GRAY, 1,"Burger Baren");
                    System.out.println(felt[i].n);
                    break;
                case 2:
                    felt[i] = new Felt(Color.DARK_GRAY, 1, "Pizzariaet");
                    System.out.println(felt[i].n);
                    break;
                case 3:
                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    System.out.println(felt[i].n);
                    break;
                case 4:
                    felt[i] = new Felt(Color.CYAN, 1,"Slikbutikken");
                    System.out.println(felt[i].n);
                    break;
                case 5:
                    felt[i] = new Felt(Color.CYAN, 1, "Iskiosken");
                    System.out.println(felt[i].n);
                    break;
                case 6:
                    felt[i] = new Felt(Color.WHITE, 0,"PÅ BESØG I FÆNGSEL");
                    System.out.println(felt[i].n);
                    break;
                case 7:
                    felt[i] = new Felt(Color.PINK, 2, "Museet");
                    System.out.println(felt[i].n);
                    break;
                case 8:
                    felt[i] = new Felt(Color.PINK, 2, "Biblioteket");
                    System.out.println(felt[i].n);
                    break;
                case 9:
                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");
                    System.out.println(felt[i].n);
                    break;
                case 10:

                    felt[i] = new Felt(Color.ORANGE, 2, "Skaterparken");
                    System.out.println(felt[i].n);
                    break;
                case 11:
                    felt[i] = new Felt(Color.ORANGE, 2, "Swimmingpoolen");
                    System.out.println(felt[i].n);
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
