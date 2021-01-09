package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    boolean exitStartMethodLabel = false;

    public void start() {
        player1.clearNumber();
        player2.clearNumber();
        int randomNum = generateSecretNum();
        System.out.println(randomNum);
        for(int i = 0; i <= 10; i++) {
            int num = inputNumFromConsole(player1.getName());
            player1.setNumber(num);
            player1.setAttempt(i + 1);
            checkingEnteredNumber(randomNum, num, player1.getAttempt(), player1);
            if(exitStartMethodLabel) {
                player1.clearNumber();
                break;
            }

            int numTwo = inputNumFromConsole(player2.getName());
            player2.setNumber(numTwo);
            player2.setAttempt(i + 1);
            checkingEnteredNumber(randomNum, numTwo, player2.getAttempt(), player2);
            if(exitStartMethodLabel) {
                player2.clearNumber();
                break;
            }
        }
    }

    private int generateSecretNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    /*
    The method read player number from console and return this number
     */
    private int inputNumFromConsole(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + name + " выбирает число");
        int num = scanner.nextInt();
        return num;
    }

    /*
    The method checks whether or not to output the array to the console
     */
    private void showEnteredNums(int a, int b) {
        if(player1.getAttempt() == 10 || player2.getAttempt() == 10) {
            for(int num: player1.getNumber()) {
                System.out.print(num + " ");
            }
            // каретка с новой строки.
            System.out.println('\r');
            for(int num1: player2.getNumber()) {
                System.out.print(num1 + " ");
            }
            System.out.println('\r');
        }
    }

    /*
    The method checks the number entered by the player and,
    depending on the result, changes the flag of the variable exitStartMethodLabel.
     */
    private void checkingEnteredNumber(int randomNum, int num, int attempt, Player player) {
        if(player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            exitStartMethodLabel = true;
            showEnteredNums(player1.getAttempt(), player2.getAttempt());
            return;
        }
        if(randomNum == num) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNum + " с " + player.getAttempt() + " попытки");
            exitStartMethodLabel = true;
        } else {
            System.out.println((num > randomNum) ? "Вы не угадали, загаданное число меньше." : "Вы не угадали, загаданное число больше. ");
            exitStartMethodLabel = false;
        }
    }
}

