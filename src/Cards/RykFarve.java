package Cards;

public class RykFarve extends Kort {
    public RykFarve(int cardNumber) {
        super(cardNumber);
    }

    public String toString(){
        discription = "";
        switch (cardNumber){
            case 6:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et orange eller grønt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale lejen til ejeren.\n";
                break;
            case 7:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et pink eller mørkeblåt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 8:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et lyseblåt eller rødt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 9:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et brunt eller gult felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            default:
                discription += cardNumber+0;
        }
        return discription;
    }
}
