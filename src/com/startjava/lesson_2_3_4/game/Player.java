package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumber(int num) {
        numbers[attempt] = num;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void clearNumber() {
        Arrays.fill(numbers, numbers.length);
    }
}
