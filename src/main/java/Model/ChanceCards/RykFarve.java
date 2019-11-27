package Model.ChanceCards;

public class RykFarve extends Kort {
    public RykFarve(int cardNumber) {
        super(cardNumber);
    }

    public String toString(){
        description = "";
        switch (cardNumber){
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
