package com.company;

public class TernaryOperators {
    public static void main(String[] args) {

        int time = 20;

        if (time < 18){
            System.out.println("Labdien!");
        }else{
            System.out.println("Labvakar!");
        }
        System.out.println("---------");
        String result = (time < 18) ? "Labdien!" : "Labvakar!";
        System.out.println(result);
        //string vietā var likt arī int kā ciparus



    }
}
