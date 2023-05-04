package simpleExercises.size10;

import java.util.Scanner;

public class MultiplicationTableOfInput {
    public static void main(String[] args) {
        System.out.println("Please give a number. Afterwards we will print its multiplication table up to 10.");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%dx%d=%d%n", input, i, input * i);
        }
    }
}
