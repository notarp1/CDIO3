import java.util.Scanner;

public class NumberOfPlayers {

    private String input;
    public int numberOfPlayers;

    NumberOfPlayers(){
        System.out.println("Indtast ønskede antal spillere");
        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();
        numberOfPlayers = Integer.parseInt(input);

    }



}
