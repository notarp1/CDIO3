import java.util.ArrayList;

public class Figur {
    private String figurListe;
    private int figurNumber;
    private String figur;
    Player player = new Player();
    ArrayList <String> Figur;

    public Figur(int figurNumber) {
        this.figurNumber = figurNumber;
    }

    public String figurListe() {
        this.figurListe = "1. SKIBET\n" +
                "Alle mænd om bord! Skibet er berejst \n" +
                "og ved præcis, hvor det skal sejle hen\n" +
                "for at holde sig forrest i spillet. Spil\n" +
                "som skibet, der har fuld fart fremad,\n" +
                "og sejl sejren sikkert hjem.\n" +
                "2. BILEN\n" +
                "Klar...parat...KØR! Den hurtige og\n" +
                "frygtløse bil skrider altid rundt i\n" +
                "svingene og drøner videre til næste\n" +
                "felt. Denne risikovillige racer vil gøre\n" +
                "alt for at holde dig i front.\n" +
                "3. HUNDEN\n" +
                "Nuttet, legesyg og loyal - hunden er\n" +
                "fuld af energi og altid sulten. Tag en\n" +
                "tur rundt i Moonopoly-byen med\n" +
                "hunden. Denne lille, beslutsomme\n" +
                "vuffer vil gøre dit alt for at vinde.\n" +
                "4. KATTEN\n" +
                "Et spindende valg. Denne kløgtige kat\n" +
                "lander altid på poterne. Katten er hurtig\n" +
                "og adræt, og den kender hver en gade\n" +
                "i byen. Spil som den drillesyge kat, så\n" +
                "kan du snart liste dig forrest.\n";
        return figurListe;
    }

    public void setFigurNumber(int figurNumber) {
        this.figurNumber = figurNumber;
    }



    public String toString(){
        this.figur = "";
        switch (figurNumber){
            case 1:
                this.figur +=("CAR");
                break;
            case 2:
                this.figur +=("RACECAR");
                break;
            case 3:
                this.figur +=("TRACTOR");
                break;
            case 4:
                this.figur +=("UFO");
                break;
            default:
                figur += figurNumber+0;
                break;
        }return figur;
    }
}