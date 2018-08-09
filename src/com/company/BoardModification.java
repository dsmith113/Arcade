package com.company;

import java.io.IOException;

class BoardModification extends BattleShip {

    public static void showBoard(int[][] board) {
        System.out.println( "\t1 \t2 \t3 \t4 \t5" );
        System.out.println();

        for (int row = 0; row < 5; row++) {
            System.out.print( (row + 1) + "" );
            for (int column = 0; column < 5; column++) {
                if (board[row][column] == -1) {
                    System.out.print( "\t" + "~" );
                } else if (board[row][column] == 0) {
                    System.out.print( "\t" + "*" );
                } else if (board[row][column] == 1) {
                    System.out.print( "\t" + "X" );
                }

            }
            System.out.println();
        }

    }

    public static void changeboard(int[] shoot, int[][] ships, int[][] board) throws IOException{
        if (Logic.hit( shoot, ships ))
            board[shoot[0]][shoot[1]] = 1;
        else
            board[shoot[0]][shoot[1]] = 0;
    }
}
