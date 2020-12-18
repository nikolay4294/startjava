class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась. Компьютер загадал число от 0 до 100. Попробуй угадать какое!");
        System.out.println("Введите имя первого игрока :");
        String firstName = scanner.next();
        Player player1 = new Player(firstName);
        System.out.println("Введите имя второго игрока :");
        String secondName = scanner.next();
        Player player2 = new Player(secondName);

        //передаю в конструктор игры созданные объекты
        GuessNumber start = new GuessNumber(player1, player2);
        String playerAnswer;
        do {
            start.game();
                while (true) {
                    System.out.println("Хотите продолжить игру? [да/нет]:");
                    playerAnswer = scanner.next();
                    System.out.println(playerAnswer);
                        if (playerAnswer.equals("да")) {
                            break;
                        } else if(playerAnswer.equals("нет")){
                            return;
                        }
                }
        } while (!playerAnswer.equals("нет")) ;
    }
 }
