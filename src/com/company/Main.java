package com.company;
import java.io.IOException;
import java.util.Scanner;
class Main {

   OregonTrail ot = new OregonTrail();
    DiceGame d = new DiceGame();
    BlackJack bj = new BlackJack();
    BattleShip bs = new BattleShip();
    Hangman h = new Hangman();

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Tyler and Debi's Arcade!!");
        System.out.println();
        chooseAGame();}


    public static void chooseAGame() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your game!");
        System.out.println("1: Blackjack");
        System.out.println("2: Hangman");
        System.out.println("3: Oregon Trail");
        System.out.println("4: Battleship");
        System.out.println("5: Pig Dice Game ");
        System.out.println("6: Quit");
        System.out.println("Enter the corresponding number 1-6 to continue:");
        String chooseGame = sc.nextLine();

        switch (chooseGame){
            case "1": BlackJack.blackJackGame();
                break;
            case "2": Hangman.HangmanGame();
                break;
            case "3": OregonTrail.oregonTrail();
                break;
            case "4": BattleShip.BattleShipGame();
                break;
            case "5": DiceGame.TheDiceGame();
                break;
            case "6": System.exit( 3 );
                break;
            default:
                System.out.println("Invalid option, Please Enter valid option");
                chooseAGame();
                break;
        }



        }
}
