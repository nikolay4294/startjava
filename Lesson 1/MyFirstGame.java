public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNum = 25;
        int playerNum = 20;

        while(playerNum <= 100) {
            if(playerNum == hiddenNum) {
                System.out.println("Вы угадали!");
                return;
            } else if(playerNum > hiddenNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNum++;
            } else if(playerNum < hiddenNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNum++;
            }
        }
    }
}
