package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Logic extends BattleShip {
    public static void shoot(int[] shoot) throws IOException {
        Scanner input = new Scanner( System.in );

        System.out.print( "Select a row (1-9): " );
        shoot[0] = input.nextInt();
        shoot[0]--;

        System.out.print( "Select a column(1-9): " );
        shoot[1] = input.nextInt();
        shoot[1]--;

    }
    public static boolean hit(int[] shoot, int[][] ships) throws IOException {

        for (int ship = 0; ship < ships.length; ship++) {
            if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
                System.out.printf( "You hit a ship located in (%d,%d)\n", shoot[0] + 1, shoot[1] + 1 );
                return true;
            }
        }
        return false;
    }

    public static void hint(int[] shoot, int[][] ships, int attempt) throws IOException {
        int row = 0, column = 0;

        for (int line = 0; line < ships.length; line++) {
            if (ships[line][0] == shoot[0])
                row++;
            if (ships[line][1] == shoot[1])
                column++;
        }

        System.out.printf( "\nHint %d: \nRow %d -> %d ships\n" +
                "Column %d -> %d ships\n", attempt, shoot[0] + 1, row, shoot[1] + 1, column );
    }
}
