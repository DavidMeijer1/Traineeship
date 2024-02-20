package levelSeven;/* The aim of this exercise is to sort the characters from two strings into a new string.
The new string only allows unique characters and has to be sorted alphabetically.
*/

import java.util.Arrays;
import java.util.HashSet;

public class SortCharacters {
    public static void main(String[] args) {
        System.out.println(sortCharacters("aretheyhere", "yestheyarehere"));
        System.out.println(sortCharacters("abcdefghijklmnopqrstuvwxyz", "xxxxyyyyabklmo"));
    }

    static String sortCharacters(String string1, String string2) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < string1.length(); i++) {
            set.add(string1.charAt(i));
        }
        for (int i = 0; i < string2.length(); i++) {
            set.add(string2.charAt(i));
        }
        char[] array = set.toString().toCharArray();
        Arrays.sort(array);
        return Arrays.toString(array).replaceAll("[^a-z]", "");
    }
}
