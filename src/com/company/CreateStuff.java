package com.company;

import java.io.IOException;
import java.util.Random;

class CreateStuff extends BattleShip {
    public static void initiateShip(int[][] ships) {
        Random random = new Random();

        for (int ship = 0; ship < 3; ship++) {
            ships[ship][0] = random.nextInt( 5 );
            ships[ship][1] = random.nextInt( 5 );

            for (int last = 0; last < ship; last++) {
                if ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]))
                    do {
                        ships[ship][0] = random.nextInt( 5 );
                        ships[ship][1] = random.nextInt( 5 );
                    } while ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]));
            }

        }
    }

    public static void initiateBoard(int[][] board) {
        for (int row = 0; row < 5; row++)
            for (int column = 0; column < 5; column++)
                board[row][column] = -1;
    }
}
