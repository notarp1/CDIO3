package Model.ChanceCards;

public class GetOutOfJail extends Kort {
    public GetOutOfJail(int cardNumber) {
        super(cardNumber);
    }
    public String toString(){
        switch (cardNumber){
            case 14:
                description = "Du løslades uden omkostninger.\n" +
                        "Behold dette kort indtil du får brug for det.\n";
                break;
            default:
                description += cardNumber+0;
        }
        return description;
    }
}
