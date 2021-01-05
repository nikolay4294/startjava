package com.startjava.lesson_2_3_4.calculator;

import java.util.*;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userAnswer;

    do {
        System.out.print("Введите математическое выражение: ");
        String mathExpression = scanner.nextLine();
        calculator.calculate(mathExpression);

        do {
            System.out.println("Хотите продолжить вычисления? [да/нет]:");
            userAnswer = scanner.nextLine();
        } while(!userAnswer.equals("да") && !userAnswer.equals("нет"));
    } while (!userAnswer.equals("нет"));
    }
}
