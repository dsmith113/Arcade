package com.company;

import java.io.IOException;
import java.util.Scanner;
class Play extends BlackJack{
    public static void playOn(double pTotal, double cTotal)throws IOException{
        Betting b = new Betting();
        Scanner sc = new Scanner(System.in);
        if(pTotal >= 22){
            System.out.println("Oops! Your total is " + (int)pTotal);
            System.out.println("Sorry, you busted! the computer won...");
            b.setMoney(b.getMoney() - b.getWager());
            System.out.println("Your new total is: $" + b.getMoney());
            playAgain();
        }

        System.out.println("Your total is: " + (int)pTotal + " Would you like to hit(1), or stay(2)? ");
        String choice = sc.nextLine().toLowerCase();
        switch(choice) {
            case "1":
            case "hit":
                pTotal += Card.cardValue();
                playOn(pTotal, cTotal);

            case "2":
            case "stay":
                while (cTotal < 16) {
                    cTotal += Card.cardValue();
                }
                exitStrategy(pTotal, cTotal);

            default:
                System.out.println("Sorry. That is not a valid response.");
                playOn(pTotal, cTotal);
        }
    }

    private static void playAgain()throws IOException {
        Betting b = new Betting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play again? y for yes, n for no.");
        String choice = sc.nextLine().toLowerCase();
        switch (choice) {
            case "y":
            case "yes":
                run();
                break;
            case "n":
            case "no":
                System.out.println( "Thanks for playing! You finished with $" + b.getMoney() );
                System.out.println();
                Main.main( null );
                break;
            default:
                System.out.println( "Sorry, that is not a valid response." );
                playAgain();
                break;
        }
    }

    private static void exitStrategy(double pTotal, double cTotal)throws IOException{
        Betting b = new Betting();
        if (cTotal >= 22) {
            System.out.println("HAHA! The computer's total is: " + (int)cTotal);
            System.out.println("The computer busted! You Win!");
            b.setMoney(b.getMoney() + b.getWager());
            System.out.println("Your new total is: $" + b.getMoney());
            playAgain();
        } else {
            if (pTotal > cTotal) {
                System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                b.setMoney(b.getMoney() + b.getWager());
                System.out.println("Your new total is: $" + b.getMoney());
                playAgain();
            } else if (cTotal > pTotal) {
                System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                b.setMoney(b.getMoney() - b.getWager());
                System.out.println("Your new total is: $" + b.getMoney());
                playAgain();
            }
            else {
                System.out.println("Your total was: " + (int)pTotal + " The computer's total was: " + (int)cTotal);
                b.setMoney(b.getMoney() - b.getWager());
                System.out.println("The dealer wins all ties.");
                System.out.println("Your new total is: $" + b.getMoney());
                playAgain();
            }
        }
    }

}
