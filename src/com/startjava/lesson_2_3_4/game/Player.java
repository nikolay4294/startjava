package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int num;
    int[] array = new int[10];
    //int[] arrayTwo = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    // метод записывает введеное пользователем число в массив.
    public void writeNumInArray(int a) {
        Arrays.fill(array, a);
    }
}
