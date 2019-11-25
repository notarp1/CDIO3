public class Player {
    private int playerNumber;
    private String playerName;
    private int playerAge;
    private int playerFigurNumber;
    private int playerStatrtBalance;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerFigurNumber() {
        return playerFigurNumber;
    }

    public void setPlayerFigurNumber(int playerFigurNumber) {
        this.playerFigurNumber = playerFigurNumber;
    }

    public int getPlayerStatrtBalance(){
        if (getPlayerNumber() == 2){
            playerStatrtBalance =20;
        }
        else if (getPlayerNumber() == 3){
            playerStatrtBalance = 18;
        }
        else if (getPlayerNumber() == 4){
            playerStatrtBalance = 16;
        }
        return playerStatrtBalance;
    }

    public String toString(){
        return "Player: "+(getPlayerNumber()) + " "+playerName+ " "+ getPlayerAge() + " years old."+ "\n"+
                "Your have chosen to be "+ new Figur(getPlayerFigurNumber()) + " and you have M"+getPlayerStatrtBalance()+
                " as a start balance.\n";
    }
}
