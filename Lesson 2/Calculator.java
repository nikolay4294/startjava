public class Calculator {
    public void getOperation(char mathOperation, int a, int b) { //метод принимает 2 значения и математический символ
        switch(mathOperation) {
            case '+' :
                System.out.println(a + b);
                break;
            case'-' :
                System.out.println(a - b);
                break;
            case '*' :
                System.out.println(a * b);
                break;
            case '/' :
                System.out.println(a / b);
                break;
            case '^' :
                long result = 1;
                for(int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(result);
                break;
            case '%' :
                System.out.println(a % b);
                break;
            default :
                System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
    }
}
