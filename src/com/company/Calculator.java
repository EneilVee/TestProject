package com.company;

public class Calculator {
    public static void main(String[] args) {
        /**Need code calculator with math operators
         using if else if statment*/
        /** char operators = '-';
         * double1=20, double2=30
         * else if (operators == '-=)
         * result = number1 - number2;
         * sout = result
         */
        double number1 = 3;
        double number2 = 30;
        double result = 0;
        char operators = '/';

        if (operators == '+') {
            result = number1 + number2;
            System.out.println("Rezultāts ir " + result + ".");
        } else if (operators == '-'){
            result = number1 - number2;
            System.out.println("Rezultāts ir " + result + ".");
        }else if (operators == '*'){
            result = number1 * number2;
            System.out.println("Rezultāts ir " + result + ".");
        }else if (operators == '/'){
            result = number1 / number2;
            System.out.println("Rezultāts ir " + result + ".");
        }else if (operators == '%') {
            result = number1 % number2;
            System.out.println("Rezultāts ir " + result + ".");
        }else{
            System.out.println("Nav tāda opertora.");
        }

    }

}

