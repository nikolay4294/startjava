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
        player1.clearNumber();
        player2.clearNumber();
        generateSecretNum();
        System.out.println(randomNum);
        for(int i = 0; i < 10; i++) {
            int num = inputNum(player1, i);
            if(checkingEnteredNumber(randomNum, num, player1.getAttempt(), player1)) {
                player1.clearNumber();
                break;
            }

            int numTwo = inputNum(player2, i);
            if(checkingEnteredNumber(randomNum, numTwo, player2.getAttempt(), player2)) {
                player2.clearNumber();
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
    private void showEnteredNums(int a, int b) {
        if(player1.getAttempt() == 10 || player2.getAttempt() == 10) {
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
    }

    /*
    The method checks the number entered by the player and,
    depending on the result, changes the flag of the variable exitStartMethodLabel.
     */
    private boolean checkingEnteredNumber(int randomNum, int num, int attempt, Player player) {
        if(player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            showEnteredNums(player1.getAttempt(), player2.getAttempt());
            return true;
        }
        if(randomNum == num) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " с " + player.getAttempt() + " попытки");
            return true;
        } else {
            System.out.println((num > randomNum) ? "Вы не угадали, загаданное число меньше." : "Вы не угадали, загаданное число больше. ");
            return false;
        }
    }
}

