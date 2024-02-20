package levelSeven;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDescending(321));
    }

    static int sortDescending(int number) {
        char[] array = Integer.toString(number).toCharArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        sb.append(array).reverse();
        return Integer.parseInt(sb.toString());
    }
}
