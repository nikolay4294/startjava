class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась. Компьютер загадал число от 0 до 100. Попробуй угадать какое!");
        System.out.println("Введите имя первого игрока :");
        Player player1 = new Player(scanner.next());
        System.out.println("Введите имя второго игрока :");
        Player player2 = new Player(scanner.next());

        //передаю в конструктор игры созданные объекты
        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer;
        do {
            game.start();
            while (true) {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                playerAnswer = scanner.next();
                System.out.println(playerAnswer);
                    if (playerAnswer.equals("да")) {
                         break;
                    } else if(playerAnswer.equals("нет")) {
                        return;
                    }
            }
        } while (!playerAnswer.equals("нет")) ;
    }
}
