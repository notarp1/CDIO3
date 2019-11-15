class Shaker {

    public Die die1;


    Shaker() {

        die1 = new Die();

    }

    int rollDice(){
        die1.roll();
        System.out.println("Du slog: " + die1.getFaceValue());
        return die1.getFaceValue();
    }



}
