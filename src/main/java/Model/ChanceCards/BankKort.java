package Model.ChanceCards;

import Model.Player;
import gui_main.GUI;

public class BankKort extends Kort {

    public BankKort(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public void action(Player player, GUI gui) {
        switch (this.cardNumber) {
            case 10:
                player.updateBalance(-2);
                break;
            case 11:
                break;
            case 12:
                player.updateBalance(2);
                break;
        }
        gui.displayChanceCard(toString());
    }

    @Override
    public String toString(){
            description = "";
            action = "";
            value = 0;
            switch (cardNumber){
                case 10:
                    description += "Du har spist for meget slik. Betal M2 til banken.\n";
                    break;
                case 11:
                    description += "Det er din fødselsdag!\n" +
                            "Alle giver dig M1\n" +
                            "Tillykke med fødselsdagen!\n";
                    break;
                case 12:
                    description += "Du har lavet alle dine lektier!\n" +
                            "Modtag M2\n" +
                            "fra banken.\n";
                    break;
                default:
                    description += cardNumber;
                    break;
            }
            return description;
        }
}
