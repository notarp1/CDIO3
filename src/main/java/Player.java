import gui_main.GUI;

import java.util.Scanner;

class Player {
    String playerName;
    Account account;
    GUI gui;

    boolean jailPass = false;

    int balance;
    int previousFelt;
    int currentFelt;
    int restFelt;

    Player(GUI gui, int startBalance) {
        this.gui = gui;
        username();
        account = new Account(startBalance);
        currentFelt = 0;
        previousFelt = 0;
    }

    private void username(){
        playerName = gui.getUserString("Spiller indtast dit navn");
    }

    @Override
    public String toString() {
        return playerName;
    }
}
