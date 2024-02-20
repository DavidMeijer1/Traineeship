package levelSeven;

import java.util.HashSet;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("dermatoglyphics"));
        System.out.println(isIsogram("moOse"));
    }

    static boolean isIsogram(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.toLowerCase().charAt(i));
        }
        return set.size() == str.length();
    }
}
