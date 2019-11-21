import java.util.Scanner;

public class Player {
    private Account account;
    private String input;
    String playerName;

    private boolean jailPass = false;

    int balance;

    int previousFelt;
    int currentFelt;
    int restFelt;

    Player(int startBalance){
        Username();
        this.account = new Account(startBalance , 0 , 0 , 0 );
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
