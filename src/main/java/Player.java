import java.util.Scanner;

public class Player {
    String playerName;

    boolean jailPass = false;

    int balance;
    int previousFelt;
    int currentFelt;
    int restFelt;

    Player(int startBalance){
        Username();
        balance = startBalance;
        currentFelt = 0;
        previousFelt = 0;
    }

    private void Username(){
        Scanner scan = new Scanner(System.in);
        playerName = scan.nextLine();
    }

    @Override
    public String toString() {
        return playerName;
    }
}
