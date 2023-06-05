package com.David.week4;

public class OddEvenWithObject {
    public static boolean isOdd(int input) {
        return input % 2 == 0;
    }

    public static void main(String[] args) {
        OddEvenWithObject test = new OddEvenWithObject();
        System.out.println(isOdd(22));
    }
}