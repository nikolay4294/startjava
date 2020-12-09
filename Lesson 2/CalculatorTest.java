class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer = "да";

        while(true) {
            if(userAnswer.equals("да")) {
                System.out.println("Введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("Введите знак математической операции : ");
                char mathSign = scanner.next().charAt(0);
                System.out.println("Введите второе число : ");
                int b = scanner.nextInt();
                calculator.doMathOperation(mathSign, a, b);
                scanner.nextLine();
                userAnswer = scanner.next();
            } else if (userAnswer.equals("нет")) {
                return;
            } else {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                userAnswer = scanner.next();
            }
        }
    }
}
