package com.company;
import java.util.Random;

class DiceRoll extends DiceGame {

    public static int diceRoll(){
        Random rand = new Random();

        int dice = rand.nextInt(6) + 1;


        return dice;
    }
}
