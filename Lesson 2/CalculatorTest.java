class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer;

        do {
            System.out.println("Введите первое число : ");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции : ");
            char mathSign = scanner.next().charAt(0);
            System.out.println("Введите второе число : ");
            int b = scanner.nextInt();
            calculator.calculate(mathSign, a, b);
                while(true) {
                    System.out.println("Хотите продолжить вычисления? [да/нет]:");
                    userAnswer = scanner.next();
                        if(userAnswer.equals("да")) {
                            break;
                        } else if(userAnswer.equals("нет")) {
                            return;
                    }
                }
        } while (!userAnswer.equals("нет"));
    }
}
