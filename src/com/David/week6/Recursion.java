package com.David.week6;

public class Recursion {
    public static void main(String[] args) {
        countdown(1239120);
    }
        public static void countdown(int n) {
        if (n == 0) {
            System.out.println("You have reached the end.");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}