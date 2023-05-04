package simpleExercises.size10;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        System.out.println("Please give an input");

        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();

        StringBuilder StringBuilder = new StringBuilder();

        StringBuilder.append(test);

        System.out.println(StringBuilder.reverse());

    }
}
