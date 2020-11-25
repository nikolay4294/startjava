public class MyFirstGame {
    public static void main(String[] args) {
        int numComputer = 25;
        int numPlayer = 20;

            while(numPlayer <= 100) {
                if(numComputer == numPlayer) {
                    System.out.println("Вы угадали!");
                    return;
                } else if(numComputer > numPlayer) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    numPlayer++;
                } else if(numComputer < numPlayer) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    numPlayer++;
                }
            }
    }
}
