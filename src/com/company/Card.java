package com.company;

class Card extends Main{

    public static double cardValue(){
        return Math.floor(Math.random() * (11-2 + 1)) +2;
    }

}
