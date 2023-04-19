package playersGuide;

import java.util.Scanner;

public class Prototype {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Please give a number between 0 and 100");
        int number = inputKeyboard.nextInt();

        boolean rightCondition = true;
        do {
            System.out.println("Please choose a number.");
            if (inputKeyboard.nextInt()==number){
                System.out.println("The number is correct!");
            } else if (inputKeyboard.nextInt()>number) {
                rightCondition = false;
                System.err.println("The number is too high.");
            } else
                rightCondition = false;
                System.err.println("The number is too low.");
        } while (!rightCondition);
    }
}