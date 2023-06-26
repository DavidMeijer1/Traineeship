package playersGuide.day23;

public class Point {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x is " + x + " and y is " + y;
    }

    public static void main(String[] args) {
        Point pointOne = new Point(2, 3);
        Point pointTwo = new Point(-4, 0);
        System.out.println(pointOne);
        System.out.println(pointTwo);
    }

}
