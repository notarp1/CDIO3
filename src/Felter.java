import java.awt.*;

public class Felter {
    Felt[] felt;

    Felter() {
        felt = new Felt[24];

        for (int i = 0; i < 24; i++) {

            switch (i) {

                case 0:
                    felt[i] = new Felt(Color.WHITE, 0, "Start");

                    break;
                case 1:
                    felt[i] = new Felt(Color.DARK_GRAY, 1,"Burger Baren");

                    break;
                case 2:
                    felt[i] = new Felt(Color.DARK_GRAY, 1, "Pizzariaet");

                    break;
                case 3:
                case 9:
                case 15:
                case 21:
                    felt[i] = new Felt(Color.WHITE, 0, "CHANCE");

                    break;
                case 4:
                    felt[i] = new Felt(Color.CYAN, 1,"Slikbutikken");

                    break;
                case 5:
                    felt[i] = new Felt(Color.CYAN, 1, "Iskiosken");
                    break;
                case 6:
                    felt[i] = new Felt(Color.WHITE, 0,"PÅ BESØG I FÆNGSEL");

                    break;
                case 7:
                    felt[i] = new Felt(Color.PINK, 2, "Museet");

                    break;
                case 8:
                    felt[i] = new Felt(Color.PINK, 2, "Biblioteket");

                    break;
                case 10:

                    felt[i] = new Felt(Color.ORANGE, 2, "Skaterparken");

                    break;
                case 11:
                    felt[i] = new Felt(Color.ORANGE, 2, "Swimmingpoolen");

                    break;
                case 12:
                    felt[i] = new Felt(Color.WHITE, 0, "GRATIS PARKERING");
                    break;
                case 13:
                    felt[i] = new Felt(Color.RED, 3, "Spillehallen");

                    break;
                case 14:
                    felt[i] = new Felt(Color.RED, 3, "Biografen");

                    break;
                case 16:
                    felt[i] = new Felt(Color.YELLOW, 3, "Legetøjsbutikken");

                    break;
                case 17:
                    felt[i] = new Felt(Color.YELLOW, 3, "Dyrehandlen");

                    break;
                case 18:
                    felt[i] = new Felt(Color.WHITE, 0, "GÅ I FÆNGSEL");

                    break;
                case 19:
                    felt[i] = new Felt(Color.GREEN, 4, "Bowlinghallen");

                    break;
                case 20:
                    felt[i] = new Felt(Color.GREEN, 4, "Zoo");

                    break;
                case 22:
                    felt[i] = new Felt(Color.BLUE, 5, "Vandlandet");

                    break;
                case 23:
                    felt[i] = new Felt(Color.BLUE, 5, "Strandpromenaden");
                    break;



            }
        }
    }
}
