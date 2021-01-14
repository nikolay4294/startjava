package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.clearNumbers();
        player2.clearNumbers();
        generateSecretNum();
        System.out.println(randomNum);

        for(int i = 0; i < 10; i++) {
            if(compareNumber(randomNum, i, player1.getAttempt(), player1)) {
                player1.clearNumbers();
                break;
            }

            compareAttempt(player2);
            if(compareNumber(randomNum, i, player2.getAttempt(), player2)) {
                player2.clearNumbers();
                break;
            }
        }
    }

    private void generateSecretNum() {
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
    }

    /*
    The method read player number from console and return this number
     */
    private int inputNum(Player player, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " выбирает число");
        int num = scanner.nextInt();
        player.setNumber(num);
        player.setAttempt(i + 1);
        return num;
    }

    /*
    The method checks whether or not to output the array to the console
     */
    private void showEnteredNums() {
            for(int num: player1.getNumbers()) {
                System.out.print(num + " ");
            }
            // каретка с новой строки.
            System.out.println('\r');
            for(int num1: player2.getNumbers()) {
                System.out.print(num1 + " ");
            }
            System.out.println('\r');
    }

    //The method compare the number entered by the player and, depending true or false
    private boolean compareNumber(int randomNum, int i, int attempt, Player player) {
        int num = inputNum(player, i);
        if(randomNum == num) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " с " + player.getAttempt() + " попытки");
            return true;
        } else {
            System.out.println("Вы не угадали, загаданное число " + ((num > randomNum) ? "меньше." : "больше. "));
            return false;
        }
    }

    private void compareAttempt(Player player) {
        if(player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            showEnteredNums();
        }
    }
}

