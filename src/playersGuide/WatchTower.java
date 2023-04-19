package playersGuide;

import java.util.Scanner;

public class WatchTower {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("What is the x value?");
        int xValue = inputKeyboard.nextInt();

        System.out.println("What is the y value?");
        int yValue = inputKeyboard.nextInt();

        System.out.println(xValue);
        System.out.println(yValue);

        if (xValue>0 && yValue>0)
            System.out.println("The direction is north-east.");
        else if (xValue > 0 && yValue <0) {
            System.out.println("The direction is south-east.");
        } else if (xValue < 0 && yValue > 0) {
            System.out.println("The direction is north-west.");
        } else
            System.out.println("The direction is south-west.");
    }
}
