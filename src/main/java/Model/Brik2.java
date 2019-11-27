package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Brik2 {

    public static void main(String[] args) {

        Brik2 brik = new Brik2();


        brik.brik();
        System.out.println();
    }


    private void brik() {

        Player player;

        String valg;
        ArrayList<String> brik = new ArrayList<String>();

        brik.add("kat");
        brik.add("hund");
        brik.add("bil");
        brik.add("skib");

        System.out.println(brik);

        System.out.println("Vælg din brik");

        while(true) {
            Scanner scan = new Scanner(System.in);
            valg = scan.nextLine();

            if (valg.equals("kat")) {
                brik.remove("kat");
                System.out.println("Du har valgt kat");
                System.out.println("Her er de resterende valg");
                System.out.println(brik);
            }
            if (valg.equals("hund")) {
                brik.remove("hund");
                System.out.println("Du har valgt hund");
                System.out.println("Her er de resterende valg");
                System.out.println(brik);

            }
            if (valg.equals("bil")) {
                brik.remove("bil");
                System.out.println("Du har valgt bil");
                System.out.println("Her er de resterende valg");
                System.out.println(brik);

            }
            if (valg.equals("skib")) {
                brik.remove("skib");
                System.out.println("Du har valgt skib");
                System.out.println("Her er de resterende valg");
                System.out.println(brik);

            }
        }

    }

}
