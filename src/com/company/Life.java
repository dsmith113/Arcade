package com.company;

import java.io.IOException;
import java.util.Random;

public class Life extends OregonTrail{

    private static int life;

    public int getLifeLite() throws IOException {
        Random rand = new Random();
        life -= rand.nextInt(25) + 1;
        if (life <= 0){
            OregonTrail.exitStrategy();
        }
        return life;}

    public int getLife() throws IOException{
        Random rand = new Random();
        life -= rand.nextInt(75) + 1;
        if (life <= 0){
            OregonTrail.exitStrategy();
        }
        return life;
    }

    public int setLife(int life) throws IOException{
        Life.life = life;
        return life;
    }


























}
