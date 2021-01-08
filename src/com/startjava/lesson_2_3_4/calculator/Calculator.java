package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        String[] splitMathExpression = mathExpression.split(" ");
        int numOne = Integer.parseInt(splitMathExpression[0]);
        char mathSing = splitMathExpression[1].charAt(0);
        int numTwo = Integer.parseInt(splitMathExpression[2]);
        int operationResult = 0;

        switch (mathSing) {
            case '+':
                operationResult = numOne + numTwo;
                break;
            case '-':
                operationResult = numOne - numTwo;
                break;
            case '*':
                operationResult =numOne * numTwo;
                break;
            case '/':
                operationResult = numOne / numTwo;
                break;
                /*
                added method of Math class
                 */
            case '^':
                operationResult = ((int) Math.pow(numOne, numTwo));
                break;
            case '%':
                operationResult = numOne % numTwo;
                break;
            default:
                System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
        return operationResult;
    }
}
