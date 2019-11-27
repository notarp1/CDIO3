package Model;

public class Shaker {

    private Die die1;
    int facevalue;

    public Shaker() {
        die1 = new Die();
    }

    public int rollDice(Player player){
        die1.roll();
        System.out.println(player +" slog: " + die1.getFaceValue());
        return die1.getFaceValue();


    }


}
