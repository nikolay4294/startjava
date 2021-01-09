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

        while(player1.getFirstPlayerAttempt() < 10 && player2.getSecondPlayerAttempt() < 10) {
            int numberFirstPlayer = readNumFromConsole(player1.getName()); // сохр в переменную число
            player1.setFirstPlayerNums(numberFirstPlayer); // записал в массив
            player1.setFirstPlayerAttempt(player1.getFirstPlayerAttempt() + 1);
            checkingNumberPlayers(randomNum, numberFirstPlayer, player1.getName());

            int numberSecondPlayer = readNumFromConsole(player2.getName());
            player2.setSecondPlayerNums(numberSecondPlayer);
            player2.setSecondPlayerAttempt(player2.getSecondPlayerAttempt() + 1);
            checkingNumberPlayers(randomNum, numberSecondPlayer, player2.getName());
        }
        System.out.println(Arrays.toString(player1.getFirstPlayerNums()));
        System.out.println(Arrays.toString(player2.getSecondPlayerNums()));
    }

    private int generateSecretNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // this method read player number from console and return this number
    private int readNumFromConsole(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + name + " выбирает число");
        int num = scanner.nextInt();
        return num;
    }

    // method checking entered player number and return answer
    private void checkingNumberPlayers(int numPlayer, int randomNum, String name) {
        if (numPlayer == randomNum) {
            System.out.println("Вы угадали!");
            //System.out.println("Игрок " + player.getName() + " угадал число " + numPlayer + " с " + player1.getFirstPlayerAttempt() + " попытки");
            return;
        } else
        System.out.println((numPlayer < randomNum) ? "Вы не угадали, загаданное число меньше. Ход переходит к игроку " + name : "Вы не угадали, загаданное число больше. Ход переходит к игроку " + name);
    }
}

