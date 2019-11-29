package Model.ChanceCards;

import Model.Player;
import gui_fields.GUI_Field;
import gui_main.GUI;

public class RykFarve extends Kort {
    public RykFarve(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public void action(Player player, GUI gui) {
        int[] options = new int[4];
        switch (this.cardNumber) {
            case 1: // Orange felter
                options[0] = 10;
                options[1] = 11;
                options[2] = 0;
                options[3] = 0;
                break;
            case 2: // Lyseblå felter
                options[0] = 4;
                options[1] = 5;
                options[2] = 0;
                options[3] = 0;
                break;
            case 4: // Røde felter
                options[0] = 13;
                options[1] = 14;
                options[2] = 0;
                options[3] = 0;
                break;
            case 6: // Orange eller grønne felter
                options[0] = 10;
                options[1] = 11;
                options[2] = 19;
                options[3] = 20;
                break;
            case 7: // Pink eller mørkblå felter
                options[0] = 7;
                options[1] = 8;
                options[2] = 22;
                options[3] = 23;
                break;
            case 8: // Lyseblå eller røde felter
                options[0] = 4;
                options[1] = 5;
                options[2] = 13;
                options[3] = 14;
                break;
            case 9: // Brune eller gule felter
                options[0] = 1;
                options[1] = 2;
                options[2] = 16;
                options[3] = 17;
                break;
        }
        gui.displayChanceCard(toString());
        GUI_Field[] felter = gui.getFields();
        String selection = "";
        if(options[2] == 0 || options[3] == 0) {
            selection = gui.getUserButtonPressed("Hvor vil du flytte til?", felter[options[0]].getTitle(), felter[options[1]].getTitle());
        } else {
            selection = gui.getUserButtonPressed("Hvor vil du flytte til?", felter[options[0]].getTitle(), felter[options[1]].getTitle(), felter[options[2]].getTitle(), felter[options[3]].getTitle());
        }
        int selected = 0;
        for(int option : options) {
            if(felter[option].getTitle().equals(selection)) {
                selected = option;
                break;
            }
        }
        player.giveFreeBee();
        player.moveTo(selected, true);
    }

    @Override
    public String toString(){
        description = "";
        switch (cardNumber){
            case 1:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et orange felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 2:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et lyseblåt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 4:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et rødt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 6:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et orange eller grønt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale lejen til ejeren.\n";
                break;
            case 7:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et pink eller mørkeblåt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 8:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et lyseblåt eller rødt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 9:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et brunt eller gult felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            default:
                description += cardNumber+0;
        }
        return description;
    }
}
