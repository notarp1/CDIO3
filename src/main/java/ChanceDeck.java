import java.util.Random;

class ChanceDeck {
    private ChanceCard[] deck;

    private static int numberOfCards = 16;

    ChanceDeck() {
        deck = new ChanceCard[numberOfCards];
        createDeck();
    }

    private void createDeck() {
        for (int i = 0; i < numberOfCards; i++) {
            String action = "";
            switch (i){
                case 0:
                    action = "Ryk frem til start \n Modtag 2M";
                    break;
                case 1:
                    action = "Ryk op til 5 felter frem";
                    break;
                case 2:
                    action = "GRATIS FELT \nRyk frem til et orange felt \nHvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;
                case 3:
                    action = "Ryk 1 felt frem eller tag et chancekort mere";
                    break;
                case 4:
                    action = "Du har spist for meget slik! \nBetal 2M til banken";
                    break;
                case 5:
                    action = "GRATIS FELT! \nRyk frem til et orange eller grønt felt. \n Hvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;
                case 6:
                    action = "GRATIS FELT! \nRyk frem til et lyseblåt felt. \nHvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;
                case 7:
                    action = "Du løslades uden omkostninger! \nBehold det her kort, indtil du får brug for det";
                    break;
                case 8:
                    action = "Ryk frem til Strandpromenaden";
                    break;
                case 9:
                    action = "TILLYKE! \nAlle giver dig 1M";
                    break;
                case 10:
                    action = "GRATIS FELT! \nRyk frem til et pink eller mørkegrønt felt. \nHvis det er ledigt, får du det gratis! \n Ellers skal du betale til ejeren";
                    break;
                case 11:
                    action = "Du har lavet alle dine lektier \nModtag 2M fra banken";
                    break;
                case 12:
                    action = "GRATIS FELT! \nRyk frem til et rødt felt. \nHvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;
                case 13:
                    action = "GRATIS FELT! \nRyk frem til Skaterparken for a lave det perfekt grind! \nHvis ingen ejer den, får du den gratis! \nEllers skal du betale til ejeren";
                    break;
                case 14:
                    action = "GRATIS FELT \nRyk frem til et lyseblåt eller rødt felt. \nHvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;
                case 15:
                    action = "GRATIS FELT \nRyk frem til et brunt eller gult felt. \nHvis det er ledigt, får du det gratis! \nEllers skal du betale til ejeren";
                    break;

            }
            deck[i] = new ChanceCard(action);
        }
    }

    ChanceCard draw(){
        ChanceCard trukket = deck[0];
        System.arraycopy(deck, 1, deck, 0, deck.length - 1);
        deck[deck.length-1]= trukket;
        return trukket;
    }

    void shuffle(){
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndexToSwap = rand.nextInt(deck.length);
            ChanceCard temp = deck[randomIndexToSwap];
            deck[randomIndexToSwap] = deck[i];
            deck[i] = temp;
        }
    }


}
