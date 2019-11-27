package Model.ChanceCards;

public class BankKort extends Kort {

    public BankKort(int cardNumber) {
        super(cardNumber);
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
                    description += cardNumber +0;
                    break;
            }
            return description;
        }
}
