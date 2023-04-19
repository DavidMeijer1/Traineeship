package com.David.week4;

public class OddEvenWithObject {
    public static boolean isOdd(int input) {
        if (input % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        OddEvenWithObject test = new OddEvenWithObject();
        System.out.println(test.isOdd(22));
    }
}