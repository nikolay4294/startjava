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
        for(int i = 0; i <= 10; i++) {
            int num = readNumFromConsole(player1.getName());
            player1.setPlayerNums(num);
            player1.setPlayerAttempt(i + 1);
                if(player1.getPlayerAttempt() == 10) {
                    System.out.println("У " + player1.getName() + " закончились попытки");
                    break;
                }
                if(randomNum == num) {
                    System.out.println("Вы угадали!");
                    System.out.println("Игрок " + player1.getName() + " угадал число " + randomNum + " с " + player1.getPlayerAttempt() + " попытки");
                    break;
                } else {
                    System.out.println((num > randomNum) ? "Вы не угадали, загаданное число меньше. Ход переходит к игроку " + player2.getName() : "Вы не угадали, загаданное число больше. Ход переходит к игроку " + player2.getName());
                }

            int numTwo = readNumFromConsole(player2.getName());
            player2.setPlayerNums(numTwo);
            player2.setPlayerAttempt(i + 1);
                if(player2.getPlayerAttempt() == 10) {
                    System.out.println("У " + player2.getName() + " закончились попытки");
                    break;
                }
                if(randomNum == numTwo) {
                    System.out.println("Вы угадали!");
                    System.out.println("Игрок " + player2.getName() + " угадал число " + randomNum + " с " + player2.getPlayerAttempt() + " попытки");
                    break;
                } else {
                    System.out.println((num > randomNum) ? "Вы не угадали, загаданное число меньше. Ход переходит к игроку " + player1.getName() : "Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
                }
        }
        writeArrayToConsole(player1.getPlayerAttempt(), player2.getPlayerAttempt());
    }

    private int generateSecretNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    /*
    method read player number from console and return this number
     */
    private int readNumFromConsole(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + name + " выбирает число");
        int num = scanner.nextInt();
        return num;
    }

    /*
    The method checks whether or not to output the array to the console
     */
    private void writeArrayToConsole(int a, int b) {
        if(player1.getPlayerAttempt() == 10 || player2.getPlayerAttempt() == 10) {
            System.out.println(Arrays.toString(player1.getPlayerNums()));
            System.out.println(Arrays.toString(player2.getPlayerNums()));
        } else {
            return;
        }
    }
}

