package playersGuide;

import java.util.Scanner;

public class DefenceOfConsolas {
    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What is the target row?");
        int row = inputKeyboard.nextInt();
        System.out.println("What is the target column?");
        int column = inputKeyboard.nextInt();

        int belowRow = row;
        int belowColumn = column-1;
        String below = "("+belowRow+", "+belowColumn+")";

        int leftRow = row-1;
        int leftColumn = column;
        String left = "("+leftRow+", "+leftColumn+")";

        int aboveRow = row;
        int aboveColumn = column+1;
        String above = "("+aboveRow+", "+aboveColumn+")";

        int rightRow = row+1;
        int rightColumn = column;
        String right = "("+rightRow+", "+rightColumn+")";

        final String ANSI_GREEN = "\u001B[32m";

        System.out.println("Target row is "+row);
        System.out.println("Target column is "+column);
        System.out.println("Deploy to:");
        System.out.println(ANSI_GREEN+below);
        System.out.println(left);
        System.out.println(above);
        System.out.println(right);

    }
}
