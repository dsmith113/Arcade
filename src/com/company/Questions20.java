package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Questions20 extends Main {

        public static void Game20()throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("You selected the Adventure Game!");
            System.out.println("Are you sure you want to play? yes/no");
            String play = sc.nextLine();

            if (play.equals("yes")) { LetsPlayAdventure(); }
            else if (play.equals("no")) { chooseAGame(); }
            else {
                System.out.println("Invalid response");
                Game20();
            }
        }


        public static void LetsPlayAdventure(){
            System.out.println("hi");
        }
    }

