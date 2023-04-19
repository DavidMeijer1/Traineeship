package com.David.week6;

import java.util.Scanner;

public class DisplayNumberPlusCopies {
    public static void main(String[] args) {
        System.out.println("Please give a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = Integer.toString(n);
        System.out.print(string + " ");
        System.out.print(string+string+ " ");
        System.out.print(string+string+string);
        System.out.println();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

    }
}
