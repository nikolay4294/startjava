package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] firstPlayerNums = new int[10];
    private int[] secondPlayerNums = new int[10];
    private int firstPlayerAttempt = 0;
    private int secondPlayerAttempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getFirstPlayerNums() {
        return Arrays.copyOf(firstPlayerNums, 10);
    }

    public void setFirstPlayerNums(int a) {
        firstPlayerNums[firstPlayerAttempt] = a;
    }

    public int[] getSecondPlayerNums() {
        return Arrays.copyOf(secondPlayerNums, 10);
    }

    public void setSecondPlayerNums(int b) {
        secondPlayerNums[secondPlayerAttempt] = b;
    }

    public int getFirstPlayerAttempt() {
        return firstPlayerAttempt;
    }

    public void setFirstPlayerAttempt(int c) {
        this.firstPlayerAttempt = c;
    }

    public int getSecondPlayerAttempt() {
        return secondPlayerAttempt;
    }

    public void setSecondPlayerAttempt(int d) {
        this.secondPlayerAttempt = d;
    }
}
