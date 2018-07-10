package com.company;

import java.io.IOException;
import java.util.Scanner;

public class DiceGame extends Main {

        public static void TheDiceGame()throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("You selected the Dice Game!");
            System.out.println("Are you sure you want to play? yes/no");
            String play = sc.nextLine();

            if (play.equals("yes")) { LetsPlayDiceGame(); }
            else if (play.equals("no")) { chooseAGame(); }
            else {
                System.out.println("Invalid response");
                TheDiceGame();
            }
        }


        public static void LetsPlayDiceGame(){
            System.out.println("hi");
        }
    }




