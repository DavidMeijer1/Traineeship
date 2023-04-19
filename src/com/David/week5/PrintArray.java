package com.David.week5;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please say how many items the array should hold.");
        int NUM_ITEMS = scanner.nextInt();

        System.out.println("Please give the values for these items, separated by a space.");
        int[] items = new int[NUM_ITEMS];

        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = scanner.nextInt();
        }

        System.out.println("The array is: " + java.util.Arrays.toString(items));

        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print("*");
        }
        System.out.print("(" + NUM_ITEMS + ")");
    }
}