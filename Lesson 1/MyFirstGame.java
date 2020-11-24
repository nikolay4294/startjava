public class MyFirstGame {
    public static void main(String[] args) {
        int a = 15; //загаданное компьютером число
        int b = 0; //введеное пользователем число

        for(int i = 0; i < 100; i++) {
            b = i;
            if(a == b) {
                 System.out.println("Вы угадали!");
            } else if(a > b) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if(a < b) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            }
        }
    }
}
