package com.startjava.lesson_2_3_4.calculator;

import java.util.*;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scanner.nextLine();

            calculator.calculate(mathematicalExpression);
                while(true) {
                    System.out.println("Хотите продолжить вычисления? [да/нет]:");
                    userAnswer = scanner.nextLine();
                        if(userAnswer.equals("да")) {
                            break;
                        } else if(userAnswer.equals("нет")) {
                            return;
                    }
                }
        } while (!userAnswer.equals("нет"));
    }
}
