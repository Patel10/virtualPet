package virtual_pet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 3");
        System.out.println("[0] Continue ");
        System.out.println("[1] Feed Clelion");
        System.out.println("[2] Play with");
        System.out.println("[3] Take for a walk");
        System.out.println("[4] Press 4 to check current status");

        String select = input.nextLine();




        System.out.println("Enter a number to begin interaction with Clelion ");

        String name = input.nextLine();

        VirtualPet myVirtualPet = new VirtualPet ("Clelion", 0, 0, 0);

        System.out.println("Hi, I'm " + myVirtualPet.getName() + " Go for it");



        do {
            System.out.println("Enter a number between 0 - 3");
            System.out.println("[0] Continue ");
            System.out.println("[1] Feed Clelion");
            System.out.println("[2] Play with");
            System.out.println("[3] Take for a walk");
            System.out.println("[4] Press 4 to check current status");

            select = input.nextLine();

            if ( select.equals("0")) {
                continue;
            }
                // 1 is Feed
        else if ( select.equals("1") ) {

                if (myVirtualPet.getHunger() - 1 < 0) {
                    System.out.println("It's reaching that point, give me a break");
                    myVirtualPet.updateHunger(-2);
                continue;
            }
                if (myVirtualPet.getSleepy() + 2 > 7) {
                    System.out.println("Getting bit overworked, need a break.");
                    myVirtualPet.updateSleepy(-2);
                    continue;
                }
                System.out.println("Yum yummm, liking the menu today");
            } // 2 is Play'
        else if ( select.equals("2")) {

                if (myVirtualPet.getHunger() + 2 > 7) {
                    System.out.println("Moving around, toss me a hotdog");
                    myVirtualPet.updateHunger(-2);
                    continue;
                }
                if (myVirtualPet.getSleepy() + 2 > 7) {
                    System.out.println(" I'm exhausted ");
                    continue;
                }
                System.out.println("Let's play fetch");
            }  // 3 is take for walk
        else if ( select.equals("3") ) {

                if (myVirtualPet.getBored() + 2 > 7) {
                    System.out.println("Bored, let's go to park");
                    continue;
                }
                System.out.println(" Let's go to park");


            }
        else if ( select.equals("4") ) {

                System.out.println("Hunger: " + myVirtualPet.getHunger());
                System.out.println("Sleepy: " + myVirtualPet.getSleepy());
                System.out.println("Bored: " + myVirtualPet.getBored());
            }


            else {
                System.out.println("WRONG NUMBER.Only select provided numbers.");
            }
             myVirtualPet.tick();

        } while (!select.equals("0") );
        }
    }

