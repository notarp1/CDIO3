import gui_main.GUI;

import java.util.Scanner;

class Player {
    String playerName;
    Account account;
    GUI gui;

    boolean jailPass = false;

    int balance;
    int currentFelt;

    Player(GUI gui, int startBalance) {
        this.gui = gui;
        username();
        account = new Account(startBalance);
        currentFelt = 0;
    }

    private void username(){
        playerName = gui.getUserString("Spiller indtast dit navn");
    }

    @Override
    public String toString() {
        return playerName;
    }
}
