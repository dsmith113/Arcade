package com.company;

import java.io.IOException;
import java.util.Scanner;

class DiceGame extends Main {

        public static void TheDiceGame()throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("You selected the Pig Dice Game!");
            System.out.println("Are you sure you want to play? y for yes, n for no");
            String play = sc.nextLine().toLowerCase();

            switch (play) {
                case "y":
                case "yes":
                    LetsPlayDiceGame();
                    break;
                case "n":
                case "no":
                    chooseAGame();
                    break;
                default:
                    System.out.println( "Invalid response" );
                    TheDiceGame();
                    break;
            }
        }


        static void LetsPlayDiceGame()throws IOException{

            System.out.println("Welcome to Pig Dice- Here are the Rules to the game!");
            System.out.println("You will play against the computer. Players will take turns rolling a 6-sided dice");
            System.out.println("The goal is to score 100 points before the computer does.");
            System.out.println("Player will roll the dice, if a 1 is rolled then it become the computers turn");
            System.out.println("If 2-6 is rolled then the player has two options, roll again or stay. If player");
            System.out.println("stays then they will keep their points, if they decide to roll they run the risk of");
            System.out.println("rolling a 1 and losing the points for that turn, once you have decided to stay");
            System.out.println("player keeps the points from that round.  The computer will have a cap of 20 points");
            System.out.println("per round.  Best of luck to you! Let's Play!");
            System.out.println();
            DicePlay.playDice(0,0,0,0);



        }
    }




