package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public void calculate (String mathematicalExpression) {
        String[] arrayOne = mathematicalExpression.split(" ");
        int numOne = Integer.parseInt(arrayOne[0]);
        char mathSing = arrayOne[1].charAt(0);
        int numTwo = Integer.parseInt(arrayOne[2]);

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
