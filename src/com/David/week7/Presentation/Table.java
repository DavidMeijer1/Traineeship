package com.David.week7.Presentation;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("How big should the multiplication table be?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println(size);
        for (int i = 1; i <= size; i++) {
            System.out.println();
            for (int j = 1; j <= size; j++) {
                if (i * j < 10) {
                    System.out.print(i * j + "   ");
                } else if (i * j < 100) {
                    System.out.print(i * j + "  ");
                } else {
                    System.out.print(i * j + " ");
                }
            }
        }
        }
    }