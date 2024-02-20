package levelSeven;

public class SquareNumbers {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(1));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
    }

    static boolean isSquare(int number) {
        return Math.sqrt((double) number) % 1 == 0;
    }

}
