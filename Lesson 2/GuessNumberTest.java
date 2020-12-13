public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.println("Введите имя первого игрока :");
        String firstName = scanner.next();
        System.out.println("Введите имя второго игрока :");
        String secondName = scanner.next();

        Player player1 = new Player(firstName);
        Player player2 = new Player(secondName);
        GuessNumber gn = new GuessNumber();
        int numComputer = gn.randomComputerNum();
        System.out.println(numComputer);
        while (true) {
            System.out.println("Игрок " + player1.getPlayerName() + " выбирает число");
            int numPlayer1 = scanner.nextInt();
            if (numPlayer1 == numComputer) {
                System.out.println("Вы угадали!");
                return;
            } else {
                System.out.println("Вы не угадали, ход переходит к игроку " + player2.getPlayerName());
            }

            int numPlayer2 = scanner.nextInt();
            if (numPlayer2 == numComputer) {
                System.out.println("Вы угадали!");
                return;
            } else {
                System.out.println("Вы не угадали, ход переходит к игроку " + player1.getPlayerName());
            }
        }
    }
}
