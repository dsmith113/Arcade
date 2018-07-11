package com.company;

class Betting extends BlackJack {
    private static int money;
    private static int wager;


    public int getMoney() {
        return money;
    }

    public int getWager() {
        return wager;
    }

    public int setMoney(int money) {
        Betting.money = money;
        return money;
    }

    public int setWager(int wager) {
        Betting.wager = wager;
        return wager;
    }



}
