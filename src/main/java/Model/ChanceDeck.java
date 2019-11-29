package Model;

import Model.ChanceCards.*;

import java.util.Arrays;
import java.util.Random;

public class ChanceDeck {
    private Kort[] cards;

    public ChanceDeck() {
        this.cards = new Kort[15];
        cards();
    }

    private void cards() {
        cards[0] = new RykTil(0);
        cards[1] = new RykFarve(1);
        cards[2] = new RykFarve(2);
        cards[3] = new RykTil(3);
        cards[4] = new RykFarve(4);
        cards[5] = new RykTil(5);
        cards[6] = new RykFarve(6);
        cards[7] = new RykFarve(7);
        cards[8] = new RykFarve(8);
        cards[9] = new RykFarve(9);
        cards[10] = new BankKort(10);
        cards[11] = new BankKort(11);
        cards[12] = new BankKort(12);
        cards[13] = new Ryk5(13);
        cards[14] = new GetOutOfJail(14);
    }

    public Kort draw() {
        Kort trukket = cards[0];
        System.arraycopy(cards, 1, cards, 0, cards.length - 1);
        cards[cards.length - 1] = trukket;
        return trukket;
    }

    public void shuffle() {
        int index;
        Kort temp;
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
        //Collections.shuffle(Arrays.asList(kort));
    }

    public String toString() {
        return Arrays.asList(cards).toString();
    }
}