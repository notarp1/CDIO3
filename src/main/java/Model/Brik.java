package Model;

import java.util.Scanner;

public class Brik {


    private boolean bilLock = false;
    private boolean racerbilLock = false;
    private boolean traktorLock = false;
    private boolean ufoLock = false;


    void brikSelect() {
        System.out.println("Tryk 1 for at være Bilen \nTryk 2 for at være Racerbilen \nTryk 3 for at være Traktoren \nTryk 4 for at være UFO'en");

        while (true) {
            System.out.println("Vælg din brik");
            Scanner scan = new Scanner(System.in);
            String characterSelect = scan.nextLine();


            if (characterSelect.equals("1")) {
                if (!bilLock) {
                    this.bilLock = true;
                    System.out.println("Du har valgt Bilen");

                    break;
                }
            }
            if (bilLock && characterSelect.equals("1")) {
                System.out.println("Bilen er allerede taget");
                continue;
            }

            if (characterSelect.equals("2")) {
                if (!racerbilLock) {
                    this.racerbilLock = true;
                    System.out.println("Du har valgt Racerbilen");
                   break;

                }
            }
            if (racerbilLock && characterSelect.equals("2")) {
                System.out.println("Racerbilen er allerede taget");

                continue;
            }

            if (characterSelect.equals("3")) {
                if (!traktorLock) {
                    this.traktorLock = true;
                    System.out.println("Du har valgt Traktoren");

                    break;
                }
            }
            if (traktorLock && characterSelect.equals("3")) {
                System.out.println("Traktoren er allerede taget");
                continue;
            }

            if (characterSelect.equals("4")) {
                if (!ufoLock) {
                    this.ufoLock = true;
                    System.out.println("Du har valgt UFO'en");

                    break;
                }
            }
            if (ufoLock && characterSelect.equals("4")) {
                    System.out.println("UFO'en er allerede taget");
                }
            }
        }
    }


