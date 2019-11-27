package Model;

import java.util.Scanner;

public class Player {


    public Account account;
    private String input;
    public String playerName;

    private boolean jailPass = false;

    public int currentFelt = 0;
    public int previousFelt = 0;

    public String brik = "";


    public Player(int startBalance){
        this.account = new Account(startBalance);
        //setUsername();
        //playerName = input;

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
