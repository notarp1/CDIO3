package Model.ChanceCards;

import Model.Player;
import gui_main.GUI;

public class GetOutOfJail extends Kort {
    public GetOutOfJail(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public void action(Player player, GUI gui) {
        player.setJailPass(true);
        gui.displayChanceCard(toString());
    }

    @Override
    public String toString(){
        if (cardNumber == 14) {
            description = "Du løslades uden omkostninger.\n" +
                    "Behold dette kort indtil du får brug for det.\n";
        } else {
            description = "Ukendt GetOutOfJail-kort... nummer: " + cardNumber;
            System.out.println(description);
        }
        return description;
    }
}
