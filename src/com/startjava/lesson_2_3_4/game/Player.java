package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] number = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return Arrays.copyOf(number, 10);
    }

    public void setNumber(int num) {
        number[attempt] = num;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void clearNumber() {
        Arrays.fill(number, 0);
    }
}
