package com.company;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    Questions20 q = new Questions20();
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
        System.out.println("3: Adventure Game");
        System.out.println("4: Battleship");
        System.out.println("5: Dice Game ");
        System.out.println("Enter the corresponding number 1-5 to continue:");
        int chooseGame = sc.nextInt();

        switch (chooseGame){
            case 1: BlackJack.blackJackGame();
                break;
            case 2: Hangman.HangmanGame();
                break;
            case 3: Questions20.Game20();
                break;
            case 4: BattleShip.BattleShipGame();
                break;
            case 5: DiceGame.TheDiceGame();
                break;
            default:
                System.out.println("Invalid option, Please Enter valid option");
                chooseAGame();
                break;
        }



        }
}
