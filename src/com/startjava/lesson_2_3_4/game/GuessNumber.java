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
        Scanner scanner = new Scanner(System.in);
        //проверяю какое число загадал компьютер
        System.out.println(randomNum);


            while (true) {
                System.out.println("Игрок " + player1.getName() + " выбирает число");
                int numPlayer = scanner.nextInt();
                player1.writeNumInArray(numPlayer);

                if (numPlayer == randomNum) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (numPlayer > randomNum) {
                    System.out.println("Вы не угадали, загаданное число меньше. Ход переходит к игроку " + player2.getName());
                } else if (numPlayer < randomNum) {
                    System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player2.getName());
                }

                int numPlayer2 = scanner.nextInt();
                player2.writeNumInArray(numPlayer2);

                if (numPlayer2 == randomNum) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (numPlayer2 > randomNum) {
                    System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
                } else if (numPlayer2 < randomNum) {
                    System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
                }
            }
        }


     public int generateSecretNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
