package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateSecretNum();
        System.out.println(secretNum);

        for (int i = 0; i < 10; i++) {
            inputNum(player1);
            if (compareNum(player1)) {
                break;
            }
            compareAttempt(player1);

            inputNum(player2);
            if (compareNum(player2)) {
                break;
            }
            compareAttempt(player2);
        }
        showEnteredNums(player1);
        showEnteredNums(player2);
        player1.clearNums();
        player2.clearNums();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private void generateSecretNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
    }

    //The method read player number from console and return this number
    private void inputNum(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " выбирает число");
        player.setNum(scanner.nextInt());
    }

    //The method compare the number entered by the player and, depending true or false
    private boolean compareNum(Player player) {
        if (secretNum == getLastNum(player)) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt() + " попытки");
            return true;
        }
        System.out.println("Вы не угадали, загаданное число " + ((getLastNum(player) > secretNum) ? "меньше." : "больше. "));
        return false;
    }

    private int getLastNum(Player player) {
        return player.getNums()[player.getAttempt() - 1];
    }

    private void compareAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    //The method checks whether or not to output the array to the console
    private void showEnteredNums(Player player) {
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println('\r');
    }
}