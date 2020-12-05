public class Calculator {

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

