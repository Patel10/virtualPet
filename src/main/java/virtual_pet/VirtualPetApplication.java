package virtual_pet;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        String select ="";

        VirtualPet myVirtualPet = new VirtualPet ("Clelion", 0, 0, 0);

        System.out.println("Hi, I'm " + myVirtualPet.getName() + " Go for it");



        do {
            System.out.println("Enter a number between 0 - 3");
            System.out.println("[0] Continue ");
            System.out.println("[1] Feed Clelion");
            System.out.println("[2] Take a break!");
            System.out.println("[3] Take for a walk");
            System.out.println("[4] Press 4 to check current status");

            select = input.nextLine();

            if ( select.equals("0")) {
                continue;
            }
                // 1 is Feed
        else if ( select.equals("1") ) {


                if (myVirtualPet.getSleepy() > 5) {
                    System.out.println("Getting bit overworked, need a break.");
                    continue;
                }
                System.out.println("Yum yummm, liking the menu today");
                myVirtualPet.feed(-3);
            } // 2 is Play'
        else if ( select.equals("2")) {

                if (myVirtualPet.getBored() > 5) {
                    System.out.println("Bored, let's go to park");
                    continue;
                }


                System.out.println("Let's rest!");
                myVirtualPet.rest(-3);

            }  // 3 is take for walk
        else if ( select.equals("3") ) {
                if (myVirtualPet.getSleepy() > 5) {
                    System.out.println(" I'm exhausted ");
                    continue;
                }

                System.out.println(" Let's go to park");
                myVirtualPet.play(-3);

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

