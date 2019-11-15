import java.util.Scanner;

public class Player {

    private String input;
    String playerName;

    private boolean jailPass = false;

    int balance;
    int previousFelt;
    int currentFelt;
    int restFelt;

    Player(int startBalance){
        Username();
        playerName = input;
        balance = startBalance;
        currentFelt = 0;
        previousFelt = 0;

    }

    private void Username(){

        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();


    }

    @Override
    public String toString() {
        return playerName;
    }
}
