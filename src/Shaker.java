import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Shaker {

    public Die die1;
    int facevalue;

    Shaker() {
        die1 = new Die();
    }

    int rollDice(){
        die1.roll();
        System.out.println("Du slog: " + die1.getFaceValue());
        return die1.getFaceValue();


    }


}
