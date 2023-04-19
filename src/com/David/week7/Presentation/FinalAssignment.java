package com.David.week7.Presentation;

import java.util.Locale;
import java.util.Scanner;

public class FinalAssignment {
    public static void main(String[] args) {
        System.out.println("Please give an input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();

        int length = input.length();
        System.out.println("The amount of characters is " + length + ".");

        String [] array = input.split(" ");
        System.out.println("The amount of words is " + array.length + ".");

        int amountOfVowels = 0;
        for (char character : input.toCharArray()) {
            if (character == 'a') {
                amountOfVowels = amountOfVowels + 1;
            } else if (character == 'e') {
                amountOfVowels = amountOfVowels + 1;
            } else if (character == 'i') {
                amountOfVowels = amountOfVowels + 1;
            } else if (character == 'o') {
                amountOfVowels = amountOfVowels + 1;
            } else if (character == 'u') {
                amountOfVowels = amountOfVowels + 1;
            } else if (character == 'y') {
                amountOfVowels = amountOfVowels + 1;
            }
        }
        System.out.println("The amount of vowels is " + amountOfVowels + ".");

        String string = array.toString();

        if(string.equals())




    }
}
