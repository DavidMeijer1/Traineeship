package levelEight;

public class SquareSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }

    static int squareSum(int[] array) {
        int sum = 0;
        for (int i : array
        ) {
            i = (int) Math.pow(i, 2);
            sum += i;
        }
        return sum;
    }
}
