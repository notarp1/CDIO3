package Model.ChanceCards;

import Model.Player;
import gui_main.GUI;

public class RykTil extends Kort {
    public RykTil(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public void action(Player player, GUI gui) {
        switch (this.cardNumber) {
            case 0:
                player.moveTo(0, true);
                break;
            case 3:
                player.moveTo(23);
                break;
            case 5:
                player.giveFreeBee();
                player.moveTo(10, false);
                break;
            default:
                break;
        }
        gui.displayChanceCard(toString());
    }

    @Override
    public String toString(){
        description = "";
        switch (cardNumber){
            case 0:
                description = "Ryk frem til START\n" +
                        "Modtag M2\n";
                break;
            case 3:
                description = "Ryk frem til strandpromenaden.\n";
                break;
            case 5:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til Skaterparken for at lave det perfekte grind!\n" +
                        "Hvis ingen ejer den, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            default:
                description = "Ukendt RykTil-kort... nummer: " + cardNumber;
                System.out.println(description);
                break;
        }
        return description;
    }
}
