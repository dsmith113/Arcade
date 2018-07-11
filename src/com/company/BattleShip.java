package com.company;

import java.io.IOException;
import java.util.Scanner;

public class BattleShip extends Main {
    public static void BattleShipGame() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("You selected the BattleShip Game!");
        System.out.println("Are you sure you want to play? yes/no");
        String play = sc.nextLine();

        if (play.equals("yes")){ LetsPlayBattleShip(); }
        else if (play.equals("no")) { chooseAGame();}
        else {
            System.out.println("Invalid response");
            BattleShipGame();
        }
    }


    public static void LetsPlayBattleShip()throws IOException{
        play();
    }

    public static void play() throws IOException {
        System.out.println("Welcome to Battleship! This game is not your standard battleship.");
        System.out.println("There are three ships hidden in a 9 by 9 grid.");
        System.out.println("You will be asked to pick a row, then a column.");
        System.out.println("If you do no pick a number from 1-9, the program will crash. Don't be that guy...");
        System.out.println("After each guess, a hint will display showing how many ships are in the row and column you selected.");
        System.out.println("The symbols: ~ = Water (not guessed) , X = hit, * = miss.");
        System.out.println("Enjoy!");
        int[][] board = new int[9][9];
        int[][] ships = new int[5][2];
        int[] shot = new int[2];
        int attempts = 0,
                shotHit = 0;

        CreateStuff.initiateBoard( board );
        CreateStuff.initiateShip( ships );

        System.out.println();

        do {
            BoardModification.showBoard( board );
            Logic.shoot( shot );
            attempts++;

            if (Logic.hit( shot, ships )) {
                Logic.hint( shot, ships, attempts );
                shotHit++;
            } else
                Logic.hint( shot, ships, attempts );

            BoardModification.changeboard( shot, ships, board );


        } while (shotHit != 5);

        System.out.println( "\n\n\nBattleship finished! You hit 5 ships in " + attempts + " attempts" );
        BoardModification.showBoard( board );
        System.out.println("Would you like to play again? 1 for yes, 2 for no");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            play();

        }
        else{
            System.exit(0);
        }
    }


}

