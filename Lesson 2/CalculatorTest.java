class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String personAnswer = "да";
        while(true) {
            if(personAnswer.equals("да")) {
                System.out.println("Введите первое число : ");
                int a = scanner.nextInt();
                System.out.println("Введите знак математической операции : ");
                char mathSign = scanner.next().charAt(0);
                System.out.println("Введите второе число : ");
                int b = scanner.nextInt();
                calculator.mathOperation(mathSign, a, b);
                scanner.nextLine();
                personAnswer = scanner.next();
            } else if (personAnswer.equals("нет")) {
                return;
            } else {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                personAnswer = scanner.next();
            }
        }
    }
}
