public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int randomNum = randomComputerNum();
        Scanner scanner = new Scanner(System.in);
        //проверяю какое число загадал компьютер
        System.out.println(randomNum);
        while (true) {
            System.out.println("Игрок " + player1.getName() + " выбирает число");
            int numPlayer1 = scanner.nextInt();
            if (numPlayer1 == randomNum) {
                System.out.println("Вы угадали!");
                break;
            } else if(numPlayer1 > randomNum) {
                System.out.println("Вы не угадали, загаданное число меньше. Ход переходит к игроку " + player2.getName());
            } else if(numPlayer1 < randomNum){
                System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player2.getName());
            }
            int numPlayer2 = scanner.nextInt();
            if (numPlayer2 == randomNum) {
                System.out.println("Вы угадали!");
                break;
            } else if(numPlayer2 > randomNum){
                System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
            } else if(numPlayer2 < randomNum){
                System.out.println("Вы не угадали, загаданное число больше. Ход переходит к игроку " + player1.getName());
            }
        }
    }

     public static int randomComputerNum() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

}
