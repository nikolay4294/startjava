package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public void calculate(String mathExpression) {
        String[] splitArray = mathExpression.split(" ");
        int numOne = Integer.parseInt(splitArray[0]);
        char mathSing = splitArray[1].charAt(0);
        int numTwo = Integer.parseInt(splitArray[2]);

        switch(mathSing) {
            case '+' :
                System.out.println(numOne + numTwo);
                break;
            case '-' :
                System.out.println(numOne - numTwo);
                break;
            case '*' :
                System.out.println(numOne * numTwo);
                break;
            case '/' :
                System.out.println(numOne / numTwo);
                break;
                /*
                added method of Math class
                 */
            case '^' :
                System.out.println((int) Math.pow(numOne, numTwo));
                break;
            case '%' :
                System.out.println(numOne % numTwo);
                break;
            default :
                System.out.println("Такого математического действия не существует. Введите корректный символ");
        }
    }
}
