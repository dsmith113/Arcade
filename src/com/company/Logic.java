package com.company;

import java.io.IOException;
import java.util.Scanner;

class Logic extends BattleShip {
    public static void shoot(int[] shoot) {
        Scanner input = new Scanner( System.in );

        System.out.print( "Select a row (1-5): " );
        shoot[0] = input.nextInt();
        shoot[0]--;

        System.out.print( "Select a column(1-5): " );
        shoot[1] = input.nextInt();
        shoot[1]--;

    }
    public static boolean hit(int[] shoot, int[][] ships) {

        for (int[] ship1 : ships) {
            if (shoot[0] == ship1[0] && shoot[1] == ship1[1]) {
                System.out.printf( "You hit a ship located in (%d,%d)\n", shoot[0] + 1, shoot[1] + 1 );
                return true;
            }
        }
        return false;
    }

    public static void hint(int[] shoot, int[][] ships, int attempt) {
        int row = 0, column = 0;

        for (int[] ship : ships) {
            if (ship[0] == shoot[0])
                row++;
            if (ship[1] == shoot[1])
                column++;
        }

        System.out.printf( "\nHint %d: \nRow %d -> %d ships\n" +
                "Column %d -> %d ships\n", attempt, shoot[0] + 1, row, shoot[1] + 1, column );
    }
}
