package simpleExercises.size10;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {

        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("The area is %.1f * %.1f = %.2f\n", width, height, area);
        System.out.printf("The perimeter is 2 * (%.1f + %.1f) = %.2f\n", width, height, perimeter);

    }
}
