import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(new Figur(0).figurListe());
        System.out.println("Enter number of players. The number of players must be between 2 and 4");
        Player player = new Player();
        player.setPlayerNumber(0);
        boolean checkPlayerNumber = true;
        while (checkPlayerNumber){
            player.setPlayerNumber(scanner.nextInt());
            if (player.getPlayerNumber() < 2 || player.getPlayerNumber() > 4) {
                System.out.println("The Number of players is not valid. The number of players must be at least 2 and max 4");
                System.out.println("Enter number of players again!");
            } else if (player.getPlayerNumber() >= 2 || player.getPlayerNumber() <= 4) {
                checkPlayerNumber = false;
                break;
            }
        }

        Player [] players = new Player[player.getPlayerNumber()];
        for (int i = 0; i<players.length; i++){
        System.out.println("Enter plyaer " +(i+1)+ " name");
        player.setPlayerName(scanner.next());
        System.out.println("Enter player " +(i+1)+ " age");
        player.setPlayerAge(scanner.nextInt());
        System.out.println("Select player " +(i+1)+ " figur");
        player.setPlayerFigurNumber(scanner.nextInt());
        System.out.println("Player: "+(i+1) + " "+player.getPlayerName()+ " "+ player.getPlayerAge() + " years old."+ "\n"+
                "Your have chosen to be "+ new Figur(player.getPlayerFigurNumber()) + " and you have M"+player.getPlayerStatrtBalance()+
                " as a start balance.\n");
        }
    }
}
