package Model.ChanceCards;

public class RykTil extends Kort {
    public RykTil(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public String toString(){
        description = "";
        switch (cardNumber){
            case 0:
                description = "Ryk frem til START\n" +
                        "Modtag M2\n";
                break;
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
            case 3:
                description = "Ryk frem til strandpromenaden.\n";
                break;
            case 4:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til et rødt felt.\n" +
                        "Hvis det er ledigt, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;
            case 5:
                description = "GRATIS FELT!\n" +
                        "Ryk frem til Skaterparken for at lave det perfekte grind!\n" +
                        "Hvis ingen ejer den, får du det GRATIS!\n" +
                        "Ellers skal du betale leje til ejeren.\n";
                break;

            default:
                description += cardNumber+0;
                break;
        }
        return description;
    }
}
