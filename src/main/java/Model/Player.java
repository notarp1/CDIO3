package Model;

import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Player {
    public Account account;
    private String input;
    public String playerName;
    private GUI_Player car;
    private GUI gui;

    public boolean passedStart = false;
    private boolean jailPass = false;
    private boolean freebee = false;

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
        gui.getFields()[this.currentFelt].setCar(this.car, true);
    }

    private void username() {
        playerName = gui.getUserString("Indtast dit navn");
    }

    public String getPlayerName() {
        return playerName;
    }

    public void updateBalance(int diff){
        account.updateBalance(diff);
        car.setBalance(account.balance);
    }

    private void updateCar(){
        gui.getFields()[this.previousFelt].setCar(this.car, false);
        gui.getFields()[this.currentFelt].setCar(this.car, true);
    }

    public void move(int amount) {
        this.previousFelt = this.currentFelt;
        this.currentFelt += amount;
        if(this.currentFelt >= 24) {
            this.currentFelt -= 24;
            this.passedStart = true;
        }
        this.updateCar();
    }

    public void moveTo(int to) {
        this.previousFelt = this.currentFelt;
        this.currentFelt = to;
        this.updateCar();
    }

    public void moveTo(int to, boolean passStart) {
        this.previousFelt = this.currentFelt;
        this.currentFelt = to;
        this.passedStart = passStart;
        this.updateCar();
    }

    public void giveFreeBee() {
        this.freebee = true;
    }
    public boolean hasFreeBee() {
        return this.freebee;
    }
    public void useFreeBee() {
        this.freebee = false;
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
