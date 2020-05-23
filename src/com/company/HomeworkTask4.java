package com.company;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /** 4.Task (You can rewrite it in switch )
         Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER"
         if the int variable "number" is 1, 2,... , 9, or other, respectively.
         Use (a) a "if-else-if-else" statement; (b) a "switch-case-default" statement.
         */

        int number = 6;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;
        if (number == 1){
            System.out.println("Viens");
        }else if (number == 2){
            System.out.println("Divi");
        }else if (number == 3) {
            System.out.println("Trīs");
        }else if (number == 4){
                System.out.println("Četri");
        }else if (number == 5){
            System.out.println("Pieci");
        }else if (number == 6){
            System.out.println("Seši");
        }else if (number == 7){
            System.out.println("Septiņi");
        }else if (number == 8){
            System.out.println("Astoņi");
        }else if (number == 9){
            System.out.println("Deviņi");
        }
        System.out.println("-----------------");

    }
}
