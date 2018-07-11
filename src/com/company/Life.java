package com.company;

import java.util.Random;

public class Life extends OregonTrail{

    private static int life;

    public int getLifeLite() {
        Random rand = new Random();
        life -= rand.nextInt(10) + 1;
        return life;}

    public int getLife() {
        Random rand = new Random();
        life -= rand.nextInt(100) + 1;
        return life;
    }

    public int setLife(int life) {
        Life.life = life;
        return life;
    }


























}
