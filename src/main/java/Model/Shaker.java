package Model;

public class Shaker {
    private Die die;

    public Shaker() {
        die = new Die();
    }

    public int rollDice(){
        int val = die.roll();
        System.out.println("Der blev slået: " + val);
        return val;
    }
}
