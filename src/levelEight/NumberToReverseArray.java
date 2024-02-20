package levelEight;

import java.util.Arrays;

public class NumberToReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberToReverseArray(12345)));
    }

    static int[] numberToReverseArray(long number) {
        StringBuilder sb = new StringBuilder(Long.toString(number)).reverse();
        String[] stringArray = sb.toString().split("");
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }
}
