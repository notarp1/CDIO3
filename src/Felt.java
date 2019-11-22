import java.awt.*;

public class Felt {


    static Color f;
    int p;
    String n;
    Player owner;
    boolean owned = false;

    Felt(Color farve, int pris, String navn){

        this.f = farve;
        this.p = pris;
        this.n = navn;

    }

    void setOwner(Player newOwner) {
        owner = newOwner;
        owned = true;
    }

    Player getOwner() {
        return owner;
    }
}
