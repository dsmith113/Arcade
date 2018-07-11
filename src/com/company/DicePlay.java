package com.company;
import java.io.IOException;
import java.util.Scanner;

public class DicePlay extends DiceGame {
    DiceRoll dr = new DiceRoll();



    public static void playDice( int playerScore, int playerTotal, int compTotal, int compScore) throws IOException {
        Scanner sc = new Scanner(System.in);

        String input;

        while (playerTotal < 100){
        do {
            int dice = DiceRoll.diceRoll();
            System.out.println("You rolled a: " + dice);
            if (dice == 1) {
                playerScore = 0;
                System.out.println("You lose your turn!");
                System.out.println("Your total is " + playerTotal);
                System.out.println();
                    compPlayDice(compTotal,compScore, playerTotal, playerScore);
            } else {
                playerScore += dice;
                System.out.println("Your total score would be: " + (playerTotal+playerScore));
                System.out.println("Enter \"yes\" to Roll Again or Enter \"no\" to stay.");
                input = sc.nextLine();
                    if (input.equals("yes")){ playDice(playerScore, playerTotal, compTotal, compScore);
                    }
                    else if (input.equals("no")) {
                System.out.println("Your new total is : " + (playerTotal+playerScore));
                playerTotal += playerScore;
                playerScore = 0;
                        System.out.println();
                    if (playerTotal>=100){
                        exitStrategy(playerTotal,compTotal );
                    }
                compPlayDice(compTotal ,compScore, playerTotal, playerScore);}
                    else {
                        System.out.println("invalid response, automatically roll again");
                        playDice(playerScore, playerTotal, compTotal, compScore);
                    }
            }
        }while (playerTotal < 100); }
        exitStrategy(playerTotal, compTotal);
    }


    public static void compPlayDice(int compTotal, int compScore, int playerTotal, int playerScore)throws IOException {
        int compRoundScore = 0;

        while (compTotal < 100){
            do {
                int dice = DiceRoll.diceRoll();
                System.out.println("Computer rolled a: " + dice);
                if (dice == 1) {
                     compScore = 0;
                    System.out.println("Computer lost its turn!");
                    System.out.println("Computer total is " + compTotal);
                    System.out.println();
                    playDice(playerScore, playerTotal, compTotal, compScore );
                } else {
                     compRoundScore += dice;
                    System.out.println("computer's round score is: " + (compScore+compRoundScore));
                    System.out.println();
                    if ((compRoundScore) >= 20) {
                        compTotal += compRoundScore;

                        if (compTotal >= 100) { exitStrategy(playerTotal, compTotal);
                        }
                        else{
                        System.out.println("The computer's round score was greater that 20, it stays with a total score of: " + compTotal);
                        System.out.println();
                        playDice(playerScore, playerTotal, compTotal,compScore);
                    }}
                    }
            }while (compTotal < 100); }
        exitStrategy(playerTotal, compTotal);    }



    public static void exitStrategy(int playerTotal, int compTotal) throws IOException {

        if (playerTotal >= 100){
            System.out.println("You WIN! You scored 100 before the computer!");
            playAgain();
        }
        else if(compTotal>= 100) {
            System.out.println("The computer wins with " + compTotal + " :(  Better luck next time!");
            playAgain();
        }
    }



    public static void playAgain() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Game Over");
        System.out.println("Would you like to play again? yes/no");
        String play = sc.nextLine();

        if (play.equals("yes")) {
            LetsPlayDiceGame();
        } else if (play.equals("no")) {
            chooseAGame();
        } else {
            System.out.println("Invalid response");
            playAgain();
        }
    }
}
