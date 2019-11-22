import java.util.Scanner;

public class Player {
    private Account account;
    private String input;
    String playerName;

    int alder;

    private boolean jailPass = false;

    int previousFelt = 0;
    int currentFelt = 0;
    int restFelt = 0;
    int balance;



    Player(int startBalance){
        Account account = new Account();
        setUsername();
        setAlder();
        playerName = input;
        balance = startBalance;
        account.balance = balance;



    }

    private void setAlder(){
        System.out.println("Indtast alder");
        Scanner scan = new Scanner(System.in);
        this.alder = scan.nextInt();

    }

    private void setUsername(){
        System.out.println("Spiller indtast dit navn");
        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();


    }

    @Override
    public String toString() {
        return playerName;
    }
}
