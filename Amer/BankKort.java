public class BankKort extends Kort {

    public BankKort(int cardNumber) {
        super(cardNumber);
    }

    public String toString(){
            discription = "";
            action = "";
            value = 0;
            switch (cardNumber){
                case 10:
                    discription += "Du har spist for meget slik. Betal M2 til banken.\n";
                    break;
                case 11:
                    discription += "Det er din fødselsdag!\n" +
                            "Alle giver dig M1\n" +
                            "Tillykke med fødselsdagen!\n";
                    break;
                case 12:
                    discription += "Du har lavet alle dine lektier!\n" +
                            "Modtag M2\n" +
                            "fra banken.\n";
                    break;
                default:
                    discription += cardNumber +0;
                    break;
            }
            return discription;
        }
}
