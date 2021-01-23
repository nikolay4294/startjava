package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void setNum(int num) {
        nums[attempt] = num;
        attempt++;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void clearNums() {
        Arrays.fill(nums, 0, attempt, 0);
    }
}
