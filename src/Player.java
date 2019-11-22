import java.util.Scanner;

public class Player {
    Account account;
    private String input;
    String playerName;

    private boolean jailPass = false;

    int previousFelt = 0;
    int currentFelt = 0;
    int restFelt = 0;
    int balance;



    Player(int startBalance){
        Account account = new Account();
        setUsername();
        playerName = input;
        balance = startBalance;
        account.balance = balance;


    }

    private void setUsername(){

        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();


    }

    @Override
    public String toString() {
        return playerName;
    }
}
