package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int secretNum;
    private int num;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateSecretNum();
        System.out.println(secretNum);

        for (int i = 0; i < 10; i++) {
            inputNum(player1, i);
            if (compareNum(i, player1)) {
                break;
            }
            compareAttempt(player1);

            inputNum(player2, i);
            if (compareNum(i, player2)) {
                break;
            }
            compareAttempt(player2);
        }
        showEnteredNums(player1);
        showEnteredNums(player2);
        player1.clearNums();
        player2.clearNums();
    }

    private void generateSecretNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
    }

    /*
    The method read player number from console and return this number
     */
    private void inputNum(Player player, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " выбирает число");
        num = scanner.nextInt();
        player.setNum(num, i);
        player.setAttempt(i + 1);
    }


    //The method checks whether or not to output the array to the console
    private void showEnteredNums(Player player) {
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println('\r');
    }

    //The method compare the number entered by the player and, depending true or false
    private boolean compareNum(int i, Player player) {
        if (secretNum == num) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt() + " попытки");
            return true;
        } else {
            System.out.println("Вы не угадали, загаданное число " + ((num > secretNum) ? "меньше." : "больше. "));
            return false;
        }
    }

    private void compareAttempt(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }
}