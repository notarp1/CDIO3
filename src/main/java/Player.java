import java.util.Scanner;

class Player {
    String playerName;
    Account account;

    boolean jailPass = false;

    int balance;
    int previousFelt;
    int currentFelt;
    int restFelt;

    Player(int startBalance){
        username();
        account = new Account();
        currentFelt = 0;
        previousFelt = 0;
    }

    private void username(){
        Scanner scan = new Scanner(System.in);
        playerName = scan.nextLine();
    }

    @Override
    public String toString() {
        return playerName;
    }
}
