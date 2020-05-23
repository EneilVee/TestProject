package com.company;

public class TestIf {
    public static void main(String[] args) {
        // creat check of temperature if temp is higher than 80.1 print hot
        double temperature = 80.2;
        if (temperature >= 80.1) {
            System.out.println("Hot!");
        } else if (75 <= temperature) {
            System.out.println("Just right!");
        } else {
            System.out.println("Cold!");
        }
    }
}

