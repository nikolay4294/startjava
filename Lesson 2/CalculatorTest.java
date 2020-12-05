public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int a = scanner.nextInt();
        System.out.println("Введите знак математической операции : ");
        char mathOperation = scanner.nextChar();
        System.out.println("Введите второе число : ");
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println(calculator);
        System.out.println("Хотите продолжить вычисления? [да/нет]:");
        String answerPerson = scanner.nextLine();
        if(!(answerPerson.equals("да"))) {
            System.out.println("Хотите продолжить вычисления? [да/нет]:");
        } else if(!(answerPerson.equals("нет"))) {
              System.out.println("Хотите продолжить вычисления? [да/нет]:");
        }
    }
}

