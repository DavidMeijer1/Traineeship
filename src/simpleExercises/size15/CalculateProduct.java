package simpleExercises.size15;

import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to multiply together?");
        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers = scanner.nextInt();
        int product = 0;
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            product = number * number;
        }
        System.out.println(product);
    }
}
