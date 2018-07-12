package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.io.IOException;
import java.util.Scanner;

public class OregonTrail {

        public static void oregonTrail()throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("You selected the Oregon Trail Game!");
            System.out.println("Are you sure you want to play? yes/no");
            String play = sc.nextLine();

            if (play.equals("yes")) { LetsOregonTrail(); }
            else if (play.equals("no")) { Main.chooseAGame(); }
            else {
                System.out.println("Invalid response");
                oregonTrail();
            }
        }


        public static void LetsOregonTrail()throws IOException{
            Scanner sc = new Scanner(System.in);

            System.out.println("Are you ready for an Oregon Trail?!");
            System.out.println("The goal of the game is to get from Missouri to Oregon");
            System.out.println("There is lots of difficult terrain along the way... Hope you make it!");
            Life l = new Life();
            l.setLife(100);
            System.out.println("What is your name");
            String name =sc.nextLine();
            System.out.println(name + ", you will start at with 100% life");
            runAdventure(name);
        }

        public static void runAdventure(String name)throws IOException{
            Scanner sc = new Scanner(System.in);
            Life l = new Life();
            System.out.println(name + ", let's get started! When would you like to leave? press the corresponding #");
            System.out.println("1 March");
            System.out.println("2 April");
            System.out.println("3 May");
            String month = sc.nextLine();

            switch (month){
                case "1":
                    int life = l.getLife();
                    System.out.println("You're on the trail, but ran into a snow storm");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    riverCrossingKansas();
                    break;
                case "2":
                    System.out.println("You have made it out of town safe");
                    System.out.println();
                    riverCrossingKansas();
                    break;
                case "3":
                    life = l.getLifeLite();
                    System.out.println("You have started out a little too late");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    riverCrossingKansas();
                    break;
                default:
                    System.out.println("Invalid option, Please Enter valid option");
                    runAdventure(name);
                    break;
            }

        }


public static void riverCrossingKansas()throws IOException{
    Scanner sc = new Scanner(System.in);
    Life l = new Life();
    System.out.println("You have made it to the Kansas river... How would you like to cross the river?");
    System.out.println("1 Ford the river");
    System.out.println("2 Caulk your wagon");
    System.out.println("3 Take the fairy");
    String cross = sc.nextLine();

    switch (cross){
        case "1":
            System.out.println("You have safely made it over the river");
            System.out.println();
            hunting();
            break;
        case "2":
            int life = l.getLife();
            System.out.println("There was trouble crossing the river");
            System.out.println("Your new life is " + life + "%");
            System.out.println();
            hunting();
            break;
        case "3":
            life = l.getLifeLite();
            System.out.println("You had to pay to take the fairy, you may not have enough money to make it to Oregon");
            System.out.println("Your new life is " + life + "%");
            System.out.println();
            hunting();
            break;
        default:
            System.out.println("Invalid option, Please Enter valid option");
            riverCrossingKansas();
            break;
    }

}


         public static void hunting ()throws IOException {
             Scanner sc = new Scanner(System.in);
             Life l = new Life();
             System.out.println("The trip across Nebraska is very long... You will need to hunt for food!");System.out.println("1 Go on one big Hunt for lots of food");
            System.out.println("2 Go on several little hunts along the way so wagon is not to heavy");
            System.out.println("3 Risk it and keep going to stay ahead of weather");
            String cross = sc.nextLine();

    switch (cross){
        case "1":
            System.out.println("You hunted enough food to make it across but the oxen are getting tired from lugging it around");
            int life = l.getLifeLite();
            System.out.println("Your new life is " + life + "%");
            System.out.println();
            mountainsWY();
            break;
        case "2":
            System.out.println("This is a great strategy but more times you hunt the more rattlesnakes you encounter, you got bit by one!");
            life = l.getLife();
            System.out.println("Your new life is " + life + "%");
            System.out.println();
            mountainsWY();
            break;
        case "3":
            System.out.println("You were lucky and made it but might not have such great luck next time. Stock up on food");
            life = l.getLife();
            System.out.println("Your new life is " + life + "%");
            System.out.println();
            mountainsWY();
            break;
        default:
            System.out.println("Invalid option, Please Enter valid option");
            hunting();
            break;
    }

}


        public static void mountainsWY ()throws IOException {
            Scanner sc = new Scanner(System.in);
            Life l = new Life();
            System.out.println("You made it across Nebraska and after your short rest at Chimney Rock, you");
            System.out.println("are ready to cross over the mountain pass of Wyoming?");
            System.out.println("1 Use a guide to get across the mountain pass");
            System.out.println("2 Take your time and so you don't get off trail");
            System.out.println("3 Go as fast as you can across");
            String mountain = sc.nextLine();

            switch (mountain) {
                case "1":
                    int life = l.getLifeLite();
                    System.out.println("You had to pay for a guide but made it across safely, you may not have enough money to make it to Oregon");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    idaho();
                    break;
                case "2":
                    life = l.getLife();
                    System.out.println("It was pretty cold on the trail and had to use a lot of energy to get across, but made it across safely");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    idaho();
                    break;
                case "3":
                    life = l.getLife();
                    System.out.println("You made it across but not without tiring your oxen and breaking an axel");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    idaho();
                    break;
                default:
                    System.out.println("Invalid option, Please Enter valid option");
                    mountainsWY();
                    break;

            }
        }

        public static void idaho() throws IOException {
            Scanner sc = new Scanner(System.in);
            Life l = new Life();
            System.out.println("You made it over the mountains and now you need to get through Idaho, You are almost there!");
            System.out.println("Along the way you see a group all circled up for safety..What do you do?");
            System.out.println("1 Go join them bc something bad is going to happen");
            System.out.println("2 Just keep passing by");
            System.out.println("3 Stop couple miles before");
            String idaho = sc.nextLine();

            switch (idaho) {
                case "1":
                    int life = l.getLifeLite();
                    System.out.println("Good Choice you survived an attack by hostages, but there was a little harm done");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    madeItOregon();
                    break;
                case "2":
                    life = l.getLifeLite();
                    System.out.println("Way to get out of Dodge and avoid the attack by hostages, Your oxen did get a little worn out from all that running");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    madeItOregon();
                    break;
                case "3":
                    life = l.getLife();
                    System.out.println("You were attacked by hostages since you were not in the group! But they only stole some of your supplys. You lucked out!");
                    System.out.println("Your new life is " + life + "%");
                    System.out.println();
                    madeItOregon();
                    break;
                default:
                    System.out.println("Invalid option, Please Enter valid option");
                    idaho();
                    break;

            }

        }

        public static void madeItOregon ()throws IOException{
            Scanner sc = new Scanner(System.in);
            Life l = new Life();
            System.out.println("Wow, you've came so far!! You are sooooo close and soooooo tired after this long journey. What will you do next?");
            System.out.println("1 Too close and just get there!");
            System.out.println("2 Rest a couple days, then finish up the trip!");
            System.out.println("3 Catch a ride the rest of the way!");
            String oregon = sc.nextLine();

            switch (oregon) {
                case "1":
                    int life = l.getLifeLite();
                    System.out.println("CONGRATULATION!!! You made it to OREGON!!! Hope you find some gold and have a great life!");
                    System.out.println("You survived with a life percentage of " + life + "%");
                    System.out.println();
                    playAgain();
                    break;
                case "2":
                    life = l.getLifeLite();
                    System.out.println("CONGRATULATION!!! You made it to OREGON!!! Hope you find some gold and have a great life!");
                    System.out.println("You survived with a life percentage of " + life + "%");
                    System.out.println();
                    playAgain();
                    break;
                case "3":
                    life = l.getLifeLite();
                    System.out.println("CONGRATULATION!!! You made it to OREGON!!! Hope you find some gold and have a great life!");
                    System.out.println("You survived with a life percentage of " + life + "%");
                    System.out.println();
                    playAgain();
                    break;
                default:
                    System.out.println("Invalid option, Please Enter valid option");
                    madeItOregon();
                    break;

            }

        }

        public static void exitStrategy()throws IOException {
            System.out.println("Sorry you ran out of life, You did not make it to Oregon.");
            playAgain();
        }

            public static void playAgain() throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Game Over");
            System.out.println("Would you like to play again? yes/no");
            String play = sc.nextLine();

            if (play.equals("yes")) {
                LetsOregonTrail();
            } else if (play.equals("no")) {
                Main.chooseAGame();
            } else {
                System.out.println("Invalid response");
                playAgain();
            }
            }

}



