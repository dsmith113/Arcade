package com.company;

import java.io.IOException;
import java.util.Random;

public class CreateStuff extends BattleShip {
    public static void initiateShip(int[][] ships) throws IOException {
        Random random = new Random();

        for (int ship = 0; ship < 5; ship++) {
            ships[ship][0] = random.nextInt( 9 );
            ships[ship][1] = random.nextInt( 9 );

            for (int last = 0; last < ship; last++) {
                if ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]))
                    do {
                        ships[ship][0] = random.nextInt( 9 );
                        ships[ship][1] = random.nextInt( 9 );
                    } while ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]));
            }

        }
    }

    public static void initiateBoard(int[][] board) throws IOException{
        for (int row = 0; row < 9; row++)
            for (int column = 0; column < 9; column++)
                board[row][column] = -1;
    }
}
