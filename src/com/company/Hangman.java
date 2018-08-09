package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.String.valueOf;

class Hangman extends Main {

    public static void HangmanGame() throws IOException {
        Scanner sc = new Scanner( System.in );

        System.out.println( "You selected the Hangman Game!" );
        System.out.println( "Are you sure you want to play? y for yes, n for no" );
        String play = sc.nextLine().toLowerCase();

        switch (play) {
            case "y":
            case "yes":
                LetsPlayHangman();
                break;
            case "n":
            case "no":
                chooseAGame();
                break;
            default:
                System.out.println( "Invalid response" );
                HangmanGame();
                break;
        }
    }


    private static void LetsPlayHangman() throws IOException {
        hangman();
    }

    private static void hangman() throws IOException {
        Scanner sc = new Scanner( System.in );
        ArrayList<String> guesses = new ArrayList( 20 );
        String word = (Words.getWord());
        String choice = "";
        int count = word.length();
        int guessesLeft = 6;
        String[] mysteryWord = new String[word.length()];
        String[] guessedWord = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = "_";
        }
        word.split( "(?!^)" );
        for (int i = 0; i < word.length(); i++) {
            mysteryWord[i] = valueOf( word.charAt( i ) );
        }
        System.out.println( "Welcome to HANGMAN presented by Tyler and Debi!" );

        RUN:
        while (count > 0 && guessesLeft > 0) {
            Boolean correct = false;
            System.out.println( "\n" );
            for (int i = 0; i < word.length(); i++) {
                System.out.print( guessedWord[i] + " " );
            }
            System.out.println( "\nPlease guess a letter: " );
            String guess = sc.nextLine();
            for (String guess2 : guesses) {
                if (guess.equals( guess2 )) {
                    System.out.println( "Sorry, you already guessed that letter." );
                    continue RUN;

                }
            }
            guess = valueOf( guess.charAt( 0 ) );
            guess = guess.toLowerCase();
            guesses.add( guess );
            for (int i = 0; i < mysteryWord.length; i++) {
                if (guess.equals( mysteryWord[i] )) {
                    guessedWord[i] = guess;
                    count -= 1;
                    correct = true;

                }

            }
            if (!correct) {
                guessesLeft -= 1;
            }
            for (int i = 0; i < word.length(); i++) {
                System.out.print( guessedWord[i] + " " );
            }
            System.out.println( "\n" );
            System.out.print( "Guessed: " );
            for (String guess1 : guesses) {
                System.out.print( guess1 + ", " );
            }
            System.out.println( "You have " + guessesLeft + " guesses left." );


            if (count == 0) {
                System.out.println( "You have guessed the word! Would you like to play again? y for yes, n for no" );

                do {
                    choice = sc.nextLine().toLowerCase();
                    switch (choice) {
                        case "y":
                        case "yes":
                            hangman();
                            break;
                        case "n":
                        case "no":
                            Main.main( null );
                            break;
                        default:
                            System.out.println( "Invalid Response. Would you like to play again? y for yes, no for no" );
                            break;
                    }
                } while (!Objects.equals( choice, "y" ) || !Objects.equals( choice, "n" ) || !Objects.equals( choice, "yes" ) || !Objects.equals( choice, "no" )) ;
            }

            if (guessesLeft == 0) {
                System.out.println( "You have run out of guesses! The word was: " + word + ". Would you like to play again? y for yes, n for no" );

                do {
                    choice = sc.nextLine().toLowerCase();
                    switch (choice) {
                        case "y":
                        case "yes":
                            hangman();
                            break;
                        case "n":
                        case "no":
                            Main.main( null );
                            break;
                        default:
                            System.out.println( "Invalid Response. Would you like to play again? y for yes, no for no" );
                            break;
                    }
                } while (!Objects.equals( choice, "y" ) || !Objects.equals( choice, "n" ) || !Objects.equals( choice, "yes" ) || !Objects.equals( choice, "no" )) ;
            }
        }

    }
}









