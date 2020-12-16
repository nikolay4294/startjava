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
        gn.startGame();
    }
}
