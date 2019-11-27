package Cards;

public class RykTil extends Kort {
    public RykTil(int cardNumber) {
        super(cardNumber);
    }

    public String toString(){
        discription = "";
        switch (cardNumber){
            case 0:
                discription = "Ryk frem til START\n" +
                        "Modtag M2\n";
                break;
            case 1:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et orange felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 2:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et lyseblåt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 3:
                discription = "Ryk frem til strandpromenaden.\n";
                break;
            case 4:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til et rødt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 5:
                discription = "GRATIS FELT!\n" +
                        "Ryk frem til Skaterparken for at lave det perfekte grind!\n" +
                        "Hvis ingen ejer den, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;

            default:
                discription += cardNumber+0;
                break;
        }
        return discription;
    }
}
