package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int randomNum = generateSecretNum();
        System.out.println(randomNum);
        int firstPlayerAttempt = 0;
        int secondPlayerAttempt = 0;

            while(true) {
                while(firstPlayerAttempt <= 10) {
                    int numPlayer = player1.readNumFromConsole(player1.getName());
                    firstPlayerAttempt++;
                    if (numPlayer == randomNum) {
                        System.out.println("Вы угадали!");
                        System.out.println(Arrays.toString(player1.getPlayerNum()));
                        return;
                    } else if (numPlayer > randomNum) {
                        System.out.println("Вы не угадали, загаданное число меньше. Ход переходит к игроку " + player2.getName());
                    } else if (randomNum > numPlayer) {
                        System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player2.getName());
                    }
                }

                while(secondPlayerAttempt <= 10) {
                    int numPlayer2 = player2.readNumFromConsole(player2.getName());
                    secondPlayerAttempt++;
                    if (numPlayer2 == randomNum) {
                        System.out.println("Вы угадали!");
                        System.out.println(Arrays.toString(player2.getPlayerNum()));
                        return;
                    } else if (numPlayer2 > randomNum) {
                        System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
                    } else if (numPlayer2 < randomNum) {
                        System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
                    }
                }
            }
    }

    private int generateSecretNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}

