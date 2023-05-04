package simpleExercises.size11;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        System.out.println("What is the side?");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        System.out.printf("The area of the hexagon is %s.%n", areaOfHexagon(side));
    }

    private static double areaOfHexagon(double side){
        return (6*(Math.pow(side, 2))/(4*(Math.tan(Math.PI/6))));
    }
}
