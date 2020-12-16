public class GuessNumber {
    //метод для определения случайного числа, которое загадал компьютер. Делаю его статическим,
    //что бы не создавать экземпляр класса при вызове метода
    public static int randomComputerNum() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        return num;
    }

    //метод в котором происходит весь игровой процесс
    public void startGame() {
        int numComputer = randomComputerNum();
        Scanner scanner = new Scanner(System.in);
        //проверяю какое число загадал компьютер
        System.out.println(numComputer);
        System.out.println("Компьютер загадал число от 0 до 100. Попробуй угадать какое!");
        while (true) {
            System.out.println("Игрок 1"  + " выбирает число");
            int numPlayer1 = scanner.nextInt();
            if (numPlayer1 == numComputer) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, ход переходит к игроку 2" );
            }
            int numPlayer2 = scanner.nextInt();
            if (numPlayer2 == numComputer) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Вы не угадали, ход переходит к игроку 1" );
            }
        }
    }

}
