package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class Player {
    private String name;
    private int[] playerNum = new int[10];

    public int[] getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int a) {
        for(int i = 0; i < playerNum.length - 1; i++) {
            playerNum[i] = a;
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // this method read player number from console and return this number
    public int readNumFromConsole(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + name + " выбирает число");
        int num = scanner.nextInt();
        setPlayerNum(num);
        return num;
    }
}
