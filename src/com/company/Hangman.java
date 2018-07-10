package com.company;

import java.util.Scanner;

public class Hangman extends Main {

        public static void HangmanGame() {
            Scanner sc = new Scanner(System.in);

            System.out.println("You selected the Hangman Game!");
            System.out.println("Are you sure you want to play? yes/no");
            String play = sc.nextLine();

            if (play.equals("yes")){ LetsPlayHangman(); }
            else if (play.equals("no")) { chooseAGame();}
            else {
                System.out.println("Invalid response");
                HangmanGame();
            }
        }


        public static void LetsPlayHangman(){
            System.out.println("hi");
        }
}
