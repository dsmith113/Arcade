package com.company;

import java.util.Scanner;

public class BlackJack extends Main {
    public static void blackJackGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("You selected the BlackJack Game!");
        System.out.println("Are you sure you want to play? yes/no");
        String play = sc.nextLine();

        if (play.equals("yes")) { LetsPlayBlackJack(); }
        else if (play.equals("no")) {chooseAGame(); }
        else {
            System.out.println("Invalid response");
            blackJackGame();
        }
    }


    public static void LetsPlayBlackJack(){
        System.out.println("hi");
    }

}
