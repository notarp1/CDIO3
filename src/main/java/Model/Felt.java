package Model;

import java.awt.*;

public class Felt {
    public Color farve;
    public int pris;
    public String navn;
    private Player owner;
    public boolean owned = false;
    public boolean ownable = false;

    Felt(Color farve, int pris, String navn){
        this.farve = farve;
        this.pris = pris;
        this.navn = navn;

        this.ownable = pris > 0;
    }

    public void setOwner(Player newOwner) {
        owner = newOwner;
        owned = true;
    }

    public Player getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return navn;
    }
}
