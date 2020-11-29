public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        char mathOperation = '*';

        if(mathOperation == '+') {
            System.out.println(a + b);
        } else if(mathOperation == '-') {
            System.out.println(a - b);
        } else if(mathOperation == '*') {
            System.out.println(a * b);
        } else if(mathOperation == '/') {
            System.out.println(a / b);
        } else if(mathOperation == '^') {
            long result = 1;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(result);
        } else if(mathOperation == '%') {
            System.out.println(a % b);
        } else {
              System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
    }
}
