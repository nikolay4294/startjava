class CalculatorTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CalculatorTest ct = new CalculatorTest();
        ct.getInformation();
    }

    public  void getInformation() {
        Calculator calculator = new Calculator();
        System.out.println("Введите первое число : ");
        int a = scanner.nextInt();
        System.out.println("Введите знак математической операции : ");
        char mathOperation = scanner.next().charAt(0);
        System.out.println("Введите второе число : ");
        int b = scanner.nextInt();
        calculator.getOperation(mathOperation, a, b);
        String personAnswer = scanner.next();
        while (true) {
            if (personAnswer.equals("да")) {
                getInformation();
            } else if (personAnswer.equals("нет")) {
                break;
            } else {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                personAnswer = scanner.next();
            }
        }
    }
}
