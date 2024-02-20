package levelEight;

import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversedSequence(5)));
    }

    static int[] reversedSequence(int number) {
        int[] array = new int[number];
        for (int i = number - 1; i >= 0; i--) {
            array[i] = number - i;
        }
        return array;
    }
}
