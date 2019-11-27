package Model.ChanceCards;

import Model.Player;
import gui_main.GUI;

public class Ryk5 extends Kort {
    public Ryk5(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public void action(Player player, GUI gui) {
        gui.displayChanceCard(toString());
        int moves = 0;
        while(moves <= 1 || moves > 5) {
            moves = gui.getUserInteger("Vælg hvor meget du vil rykke", 1, 5);
        }
        player.move(moves);
    }

    @Override
    public String toString(){
        if (cardNumber == 13) {
            description = "Ryk op til 5 felter frem\n";
        } else {
            description += cardNumber;
        }
        return description;
    }
}
