package com.company;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

class BattleShip extends Main {
    public static void BattleShipGame() throws IOException {
        Scanner sc = new Scanner( System.in );


        System.out.println( "You selected the BattleShip Game!" );
        System.out.println( "Are you sure you want to play? y for yes, n for no" );
        String play = sc.nextLine().toLowerCase();

        switch (play) {
            case "yes":
            case "y":
                LetsPlayBattleShip();
                break;
            case "no":
            case "n":
                chooseAGame();
                break;
            default:
                System.out.println( "Invalid response" );
                BattleShipGame();
                break;
        }
    }


    private static void LetsPlayBattleShip() throws IOException {
        play();
    }

    private static void play() throws IOException {
        System.out.println( "Welcome to Battleship! This game is not your standard battleship." );
        System.out.println( "There are three ships hidden in a 5 by 5 grid." );
        System.out.println( "You will be asked to pick a row, then a column." );
        System.out.println( "If you do no pick a number from 1-5, the program will crash. Don't be that guy..." );
        System.out.println( "After each guess, a hint will display showing how many ships are in the row and column you selected." );
        System.out.println( "The symbols: ~ = Water (not guessed) , X = hit, * = miss." );
        System.out.println( "Enjoy!" );
        String choice = "";
        int[][] board = new int[5][5];
        int[][] ships = new int[3][2];
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


        } while (shotHit != 3);

        System.out.println( "\n\n\nBattleship finished! You hit 3 ships in " + attempts + " attempts" );
        BoardModification.showBoard( board );
        System.out.println( "Would you like to play again? y for yes, n for no" );
        Scanner sc = new Scanner( System.in );
        do {
            choice = sc.nextLine().toLowerCase();
            switch (choice) {
                case "y":
                case "yes":
                    BattleShipGame();
                    break;
                case "n":
                case "no":
                    Main.main( null );
                    break;
                default:
                    System.out.println( "Invalid Response. Would you like to play again? y for yes, no for no" );
                    break;
            }
        } while (!choice.equals(  "y" ) || !choice.equals(  "n" ) || !choice.equals(  "yes" ) || !choice.equals(  "no" )) ;


    }

}