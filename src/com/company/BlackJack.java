package com.company;

import java.io.IOException;
import java.util.Scanner;

public class BlackJack  {
    public static void blackJackGame() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("You selected the BlackJack Game!");
        System.out.println("Are you sure you want to play? y/n");
        String play = sc.nextLine();

        if (play.equals("y")) { LetsPlayBlackJack(); }
        else if (play.equals("n")) {Main.chooseAGame(); }
        else {
            System.out.println("Invalid response");
            blackJackGame();
        }
    }


    public static void LetsPlayBlackJack()throws IOException{
        Betting c = new Betting();
            c.setMoney(1000);
            run();
        }

        static void run() throws IOException{
            System.out.println("run");
        Betting b = new Betting();
            Scanner sc = new Scanner(System.in);
            double cCard1 = Card.cardValue();
            double cCard2 = Card.cardValue();
            double pCard1 = Card.cardValue();
            double pCard2 = Card.cardValue();
            double pTotal = pCard1 + pCard2;
            double cTotal = cCard1 + cCard2;
            int money = b.getMoney();
            if(b.getMoney() == 0){
                System.out.println("You have run out of money!");
                Main.main(null);
            }

            System.out.println("##Welcome to Black Jack!##");
            System.out.println("Your current money is: " + b.getMoney() + " How much would you like to bet on this game?");
            int wager = b.setWager(sc.nextInt());
            if(wager > money){
                System.out.println("You don't have that much to bet.");
                run();
            }
            System.out.println("Dealing................");
            System.out.println("You are dealt two cards");
            System.out.println("Your first card has a value of: " + (int)pCard1);
            System.out.println("Your second card has a value of: " + (int)pCard2);
            System.out.println("The total of your cards is: " + (int)pTotal);
            System.out.println("The computer was dealt two cards.");
            System.out.println("The value of the first card is " + (int)cCard1);
            Play.playOn(pTotal, cTotal);

        }


    }

