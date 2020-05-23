package com.company;

public class SwitchTest {
    public static void main(String[] args) {

        double number1 = 5.17;
        double number2 = 30;
        double result = 0;
        char operators = '+';
        switch (operators) {
            case '+':
                result = number1 + number2;
                System.out.println(result);
                break;
            case '-':
                result = number1 + number2;
                System.out.println(result);
                break;
            default:
                System.out.println("NO such operator");

        }


    }
}
