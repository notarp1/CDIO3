package Model;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
    public Account account;
    private String input;
    public String playerName;
    public GUI_Player car;

    GUI gui;

    private boolean jailPass = false;

    public int currentFelt = 0;
    public int previousFelt = 0;

    public String brik = "";

    public Player(GUI gui, int startBalance) {
        this.gui = gui;
        username();
        account = new Account(startBalance);

        GUI_Player playercar = new GUI_Player(playerName, account.balance, new GUI_Car());
        gui.addPlayer(playercar);
        car = playercar;
    }

    private void username() {
        playerName = gui.getUserString("Idtast dit navn");
    }

    public String getPlayerName() {
        return playerName;
    }

    public void updateBalance(int diff){
        account.updateBalance(diff);
        car.setBalance(account.balance);
    }

    public boolean getJailPass() {
        return this.jailPass;
    }
    public void setJailPass(boolean inp) {
        this.jailPass = inp;
    }

    @Override
    public String toString() {
        return playerName;
    }
}
