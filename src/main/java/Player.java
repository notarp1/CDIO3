import gui_main.GUI;

class Player {
    private static String playerName;
    Account account;
    private GUI gui;

    private static boolean jailpass = false;

    int currentField;
    int age;

    Player(GUI gui, int startBalance) {
        this.gui = gui;
        username();
        account = new Account(startBalance);
        currentField = 0;
    }

    private void username() {
        playerName = gui.getUserString("Spiller indtast dit navn");
    }

    String getPlayerName() {
        return playerName;
    }

    void addJailpass() {
        jailpass = true;
    }

    void useJailpass() {
        jailpass = false;
    }

    @Override
    public String toString() {
        return playerName;
    }
}
