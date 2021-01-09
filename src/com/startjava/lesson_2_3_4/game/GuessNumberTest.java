package com.startjava.lesson_2_3_4.game;

import java.util.*;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        //передаю в конструктор игры созданные объекты
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer;
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                playerAnswer = scanner.next();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
            player1.clearPlayerNums();
            player2.clearPlayerNums();
        } while (!playerAnswer.equals("нет")) ;
    }
}
