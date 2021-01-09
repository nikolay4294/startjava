package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        String[] splitMathExpression = mathExpression.split(" ");
        int numOne = Integer.parseInt(splitMathExpression[0]);
        char mathSing = splitMathExpression[1].charAt(0);
        int numTwo = Integer.parseInt(splitMathExpression[2]);

        switch (mathSing) {
            case '+':
                return numOne + numTwo;
            case '-':
                return numOne - numTwo;
            case '*':
                return numOne * numTwo;
            case '/':
                return numOne / numTwo;
                /*
                added method of Math class
                 */
            case '^':
                return ((int) Math.pow(numOne, numTwo));
            case '%':
                return numOne % numTwo;
            default:
                System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
        return 0;
    }
}
