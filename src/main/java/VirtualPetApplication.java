package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);

        System.out.println("Clelion");
        String name = input.nextLine();

        VirtualPet = newVirtualPet(Clelion);
        System.out.println("Hi" + pet.getName() + "Go for it");

        int select;

        do {
            System.out.println("Enter a number between 0 - 3");
            System.out.println("[0] Continue ");
            System.out.println("[1] Feed Clelion");
            System.out.println("[2] Play with");
            System.out.println("[3] Take for a walk");

            select = input.nextLine();

            if ( select == 0) {
                continue;
            }
                // 1 is Feed
        else if ( select == 1 ) {

                if (pet.getHunger() - 1 < 0) {
                    System.out.println("It's reaching that point, give me a break");
                continue;
            }
                if (pet.getSleepy() + 2 > 7) {
                    System.out.println("Getting bit overworked, need a break.");
                    continue;
                }
                System.out.println("Yum yummm, liking the menu today");
            } // 2 is Play
        else if ( select == 2) {

                if (pet.getHunger() + 2 > 7) {
                    System.out.println("Moving around, toss me a hotdog");
                    continue;
                }
                if (pet.getSleepy() + 2 > 7) {
                    System.out.println(" I'm exhausted ");
                    continue;
                }
                System.out.println("Let's play fetch");
            }  // 3 is take for walk
        else if ( select == 3) {

                if (pet.getBored() + 2 > 7) {
                    System.out.println("Bored, let's go to park");
                    continue;
                }
                System.out.println(" Let's go to park");

                String[] food = new String[]{"Carrot.", "Apple.", "Chicken."};
                System.out.println(food[rand.nextInt(food.length)]);
            }
            else {
                System.out.println("WRONG NUMBER.Only select provided numbers.");
            }
             pet.tick();

        } while (select == 0 );
        }
    }

