package com.company;

import java.util.Scanner;

public class BattleShip extends Main {
    public static void BattleShipGame() {
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


    public static void LetsPlayBattleShip(){
        System.out.println("hi");
    }
}
