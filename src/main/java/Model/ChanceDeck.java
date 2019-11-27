package Model;

import Model.ChanceCards.*;

import java.util.Arrays;
import java.util.Random;

public class ChanceDeck {
    private int cardNumber;
    private Model.ChanceCards.Kort kort = new Model.ChanceCards.Kort(0);
    private Model.ChanceCards.Kort[] korts;

    public ChanceDeck() {
        this.korts = new Kort[15];
        cards();
    }

    public void cards() {
        korts[0] = new RykTil(0);
        korts[1] = new RykFarve(1);
        korts[2] = new RykFarve(2);
        korts[3] = new RykTil(3);
        korts[4] = new RykFarve(4);
        korts[5] = new RykTil(5);
        korts[6] = new RykFarve(6);
        korts[7] = new RykFarve(7);
        korts[8] = new RykFarve(8);
        korts[9] = new RykFarve(9);
        korts[10] = new BankKort(10);
        korts[11] = new BankKort(11);
        korts[12] = new BankKort(12);
        korts[13] = new Ryk5(13);
        korts[14] = new GetOutOfJail(14);
    }

    public Kort draw() {
        Kort trukket = korts[0];
        for (int i = 0; i < korts.length - 1; i++) {
            korts[i] = korts[i + 1];
        }
        korts[korts.length - 1] = trukket;
        return trukket;
    }

    public void shuffle() {
        int index;
        Kort temp;
        Random random = new Random();
        for (int i = korts.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = korts[index];
            korts[index] = korts[i];
            korts[i] = temp;
        }
        //Collections.shuffle(Arrays.asList(kort));
    }

    public String toString() {
        return Arrays.asList(korts).toString();
    }
}