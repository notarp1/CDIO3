package Model;

import java.awt.*;

public class Felt {


    public Color f;
    public int p;
    public String n;
    Player owner;
    public boolean owned = false;

    Felt(Color farve, int pris, String navn){

        this.f = farve;
        this.p = pris;
        this.n = navn;

    }

    public void setOwner(Player newOwner) {
        owner = newOwner;
        owned = true;
    }

    public Player getOwner() {
        return owner;
    }
}
