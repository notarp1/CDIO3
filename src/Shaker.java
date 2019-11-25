import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Shaker {

    private Die die1;
    int facevalue;

    Shaker() {
        die1 = new Die();
    }

    int rollDice(Player player){
        die1.roll();
        System.out.println(player +" slog: " + die1.getFaceValue());
        return die1.getFaceValue();


    }


}
