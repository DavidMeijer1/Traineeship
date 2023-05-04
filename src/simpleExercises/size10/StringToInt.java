package simpleExercises.size10;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println("Please give a number.");
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.next();
        System.out.printf("The integer value is %d%n", Integer.parseInt(numberAsString));
    }
}
