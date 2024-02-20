package levelSeven;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(1, 0));
        System.out.println(sumOfNumbers(1, 2));
        System.out.println(sumOfNumbers(0, 1));
        System.out.println(sumOfNumbers(1, 1));
        System.out.println(sumOfNumbers(-1, 0));
        System.out.println(sumOfNumbers(-1, 2));
    }

    static int sumOfNumbers(int a, int b) {
        int result = 0;
        if (a == b) {
            return a;
        }
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            result += i;
        }
        return result;
    }
}
