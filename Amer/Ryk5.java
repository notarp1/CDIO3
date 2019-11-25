public class Ryk5 extends Kort {
    public Ryk5(int cardNumber) {
        super(cardNumber);
    }
    public String toString(){
        switch (cardNumber){
            case 13:
                discription = "Ryk op til 5 felter frem\n";
                break;
            default:
                discription += cardNumber+0;
        }
        return discription;
    }
}
