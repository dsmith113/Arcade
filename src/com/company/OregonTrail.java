package com.company;

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


        public static void LetsOregonTrail(){
            System.out.println("Are you ready for an Oregon Trail?!");
            System.out.println("The goal of the game is to get from Missouri to Oregon");
            System.out.println("There is lots of difficult terrain along the way... Hope you make it!");
            Life l = new Life();
            l.setLife(100);
            runAdventure();
        }

        public static void runAdventure(){
            System.out.println("");
          //  what is your name who traveling with
            //        when would you like to leave?

        }






        public static void exitStrategy(){


}

}

