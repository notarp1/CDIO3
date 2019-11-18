public class Felter {
// skal nok laves om til arrays, FARVE[], PRIS[], NAVN[]

    char farve;
    int pris;
    String navn;
    public int felt;

    public void Felter() {


        switch (felt) {

            // HVID = 'A', BRUN = 'B', LYSEBLÅ = C, PINK = D, ORANGE = E, RØD = F, GUL = G, GRØN= H, BLÅ = I

            case 0:
                farve = 'A';
                pris = 0;
                navn = "Start";
                System.out.println("Du lander på " + navn);
                break;
            case 1:
                farve = 'B';
                pris = 1;
                navn = "Burger Baren";
                System.out.println("Du lander på " + navn);
                break;
            case 2:
                farve = 'B';
                pris = 1;
                navn = "Pizzariaet";
                System.out.println("Du lander på " + navn);
                break;
            case 3:
                farve = 'A';
                pris = 0;
                navn = "CHANCE";
                System.out.println("Du lander på " + navn);
                break;
            case 4:
                farve = 'C';
                pris = 1;
                navn = "Slikbutikken";
                System.out.println("Du lander på " + navn);
                break;
            case 5:
                farve = 'C';
                pris = 1;
                navn = "Iskiosken";
                System.out.println("Du lander på " + navn);
                break;
            case 6:
                farve = 'A';
                pris = 0;
                navn = "PÅ BESØG I FÆNGSEL";
                System.out.println("Du lander på " + navn);
                break;
            case 7:
                farve = 'D';
                pris = 2;
                navn = "Museet";
                System.out.println("Du lander på " + navn);
                break;
            case 8:
                farve = 'D';
                pris = 2;
                navn = "Biblioteket";
                System.out.println("Du lander på " + navn);
                break;
            case 9:
                farve = 'A';
                pris = 0;
                navn = "CHANCE";
                System.out.println("Du lander på " + navn);
                break;
            case 10:
                farve = 'E';
                pris = 2;
                navn = "Skaterparken";
                System.out.println("Du lander på " + navn);
                break;
            case 11:
                farve = 'E';
                pris = 2;
                navn = "Swimmingpoolen";
                System.out.println("Du lander på " + navn);
                break;
            case 12:
                farve = 'A';
                pris = 0;
                navn = "GRATIS PARKERING";
                System.out.println("Du lander på " + navn);
                break;
            case 13:
                farve = 'F';
                pris = 3;
                navn = "Spillehallen";
                System.out.println("Du lander på " + navn);
                break;
            case 14:
                farve = 'F';
                pris = 3;
                navn = "Biografen";
                System.out.println("Du lander på " + navn);
                break;
            case 15:
                farve = 'A';
                pris = 0;
                navn = "CHANCE";
                System.out.println("Du lander på " + navn);
                break;
            case 16:
                farve = 'G';
                pris = 3;
                navn = "Legetøjsbutikken";
                System.out.println("Du lander på " + navn);
                break;
            case 17:
                farve = 'G';
                pris = 3;
                navn = "Dyrehandlen";
                System.out.println("Du lander på " + navn);
                break;
            case 18:
                farve = 'A';
                pris = 0;
                navn = "GÅ I FÆNGSEL";
                System.out.println("Du lander på " + navn);
                break;
            case 19:
                farve = 'H';
                pris = 4;
                navn = "Bowlinghallen";
                System.out.println("Du lander på " + navn);
                break;
            case 20:
                farve = 'H';
                pris = 4;
                navn = "Zoo";
                System.out.println("Du lander på " + navn);
                break;
            case 21:
                farve = 'A';
                pris = 0;
                navn = "CHANCE";
                System.out.println("Du lander på " + navn);
                break;
            case 22:
                farve = 'I';
                pris = 5;
                navn = "Vandlandet";
                System.out.println("Du lander på " + navn);
                break;
            case 23:
                farve = 'I';
                pris = 5;
                navn = "Standpromenaden";
                System.out.println("Du lander på " + navn);
                break;

        }
    }
}