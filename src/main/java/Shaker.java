class Shaker {

    public Die die;

    Shaker() {
        die = new Die();
    }

    int rollDice(){
        int val = die.roll();
        System.out.println("Du slog: " + val);
        return val;
    }



}
