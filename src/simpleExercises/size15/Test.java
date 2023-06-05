package simpleExercises.size15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }

        System.out.println(rev);
    }
}
