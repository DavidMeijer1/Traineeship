package levelSeven;

import java.util.Arrays;

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(complementaryDNA("ATTGC"));
        System.out.println(complementaryDNA("GTAT"));
    }

    static String complementaryDNA(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (input.charAt(i) == 'A') {
                array[i] = 'T';
            }
            if (input.charAt(i) == 'T') {
                array[i] = 'A';
            }
            if (input.charAt(i) == 'C') {
                array[i] = 'G';
            }
            if (input.charAt(i) == 'G') {
                array[i] = 'C';
            }
        }
        return new String(array);
    }
}

