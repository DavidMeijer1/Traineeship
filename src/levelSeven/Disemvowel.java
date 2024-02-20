package levelSeven;

public class Disemvowel {
    public static void main(String[] args) {
        System.out.println(disemvowel("Hello"));
    }

    static String disemvowel(String str) {
        return str.replaceAll("[AEUIOaeuio]", "");
    }
}