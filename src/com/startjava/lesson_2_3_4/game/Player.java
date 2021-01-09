package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] playerNums = new int[10];
    private int playerAttempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayerNums() {
        return Arrays.copyOf(playerNums, 10);
    }

    public void setPlayerNums(int a) {
        playerNums[playerAttempt] = a;
    }

    public int getPlayerAttempt() {
        return playerAttempt;
    }

    public void setPlayerAttempt(int c) {
        this.playerAttempt = c;
    }

    public void clearPlayerNums() {
        Arrays.fill(playerNums, 0);
    }
}
