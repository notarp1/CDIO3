package Model.ChanceCards;

public class Ryk5 extends Kort {
    public Ryk5(int cardNumber) {
        super(cardNumber);
    }

    @Override
    public String toString(){
        switch (cardNumber){
            case 13:
                description = "Ryk op til 5 felter frem\n";
                break;
            default:
                description += cardNumber+0;
        }
        return description;
    }
}
