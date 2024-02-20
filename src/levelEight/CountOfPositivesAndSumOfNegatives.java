package levelEight;

import java.util.Arrays;

public class CountOfPositivesAndSumOfNegatives {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countOfPositivesAndSumOfNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }

    static int[] countOfPositivesAndSumOfNegatives(int[] array) {
        if (array == null) {
            return new int[]{};
        }
        if (array.length == 0) {
            return new int[]{};
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return new int[]{count, sum};
    }

}
