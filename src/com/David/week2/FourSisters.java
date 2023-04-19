package com.David.week2;

import java.util.Scanner;

public class FourSisters {
    public static void main(String[] args) {
        final int PEOPLE = 4;

        System.out.println("How many eggs should be laid?");
        Scanner inputKeyboard = new Scanner(System.in);
        int eggs = inputKeyboard.nextInt();
        System.out.println(eggs+" eggs should be laid.");
        int eggsPerSister = eggs/PEOPLE;
        System.out.println("Each sisters gets "+eggsPerSister+" eggs.");
        double eggsForDuckbear = eggsPerSister % PEOPLE;
        System.out.println(eggsForDuckbear);
    }



}
