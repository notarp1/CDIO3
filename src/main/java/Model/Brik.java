package Model;

import java.util.Scanner;

public class Brik {


    private boolean skibLock = false;
    private boolean hundLock = false;
    private boolean katLock = false;
    private boolean bilLock = false;


    void brikSelect() {
        System.out.println("Tryk 1 for Skibet \nTryk 2 for at være Hunden \nTryk 3 for at være Katten \nTryk 4 for at være Bilen");

        while (true) {
            System.out.println("Vælg din brik");
            Scanner scan = new Scanner(System.in);
            String characterSelect = scan.nextLine();


            if (characterSelect.equals("1")) {
                if (!skibLock) {
                    this.skibLock = true;
                    System.out.println("Du har valgt skibet");

                    break;
                }
            }
            if (skibLock && characterSelect.equals("1")) {
                System.out.println("Skibet er allerede taget");
                continue;
            }

            if (characterSelect.equals("2")) {
                if (!hundLock) {
                    this.hundLock = true;
                    System.out.println("Du har valgt Hunden");
                   break;

                }
            }
            if (hundLock && characterSelect.equals("2")) {
                System.out.println("Hunden er allerede taget");

                continue;
            }

            if (characterSelect.equals("3")) {
                if (!katLock) {
                    this.katLock = true;
                    System.out.println("Du har valgt Katten");

                    break;
                }
            }
            if (katLock && characterSelect.equals("3")) {
                System.out.println("Katten er allerede taget");
                continue;
            }

            if (characterSelect.equals("4")) {
                if (!bilLock) {
                    this.bilLock = true;
                    System.out.println("Du har valgt Bilen");

                    break;
                }
            }
            if (bilLock && characterSelect.equals("4")) {
                    System.out.println("Bilen er allerede taget");
                }
            }
        }
    }

