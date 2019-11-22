import java.util.Scanner;

public class Player {


    public Account account;
    private String input;
    String playerName;

    private boolean jailPass = false;

    int currentFelt = 0;




    Player(int startBalance){
        this.account = new Account(startBalance);
        setUsername();
        playerName = input;

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
