package levelEight;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }

    static String reverseWords(String str) {
        String[] array = str.split(" ");
        String[] resultArray = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            resultArray[i] = array[array.length - 1 - i];
        }
        return Arrays.toString(resultArray).replaceAll("[\\]\\[,]", "");
    }
}
