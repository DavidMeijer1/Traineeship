package levelSeven;

public class GetMiddle {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
    }

    public static String getMiddle(String word) {

        int letters = word.length();
        int middleLetter = letters / 2;
        if (letters % 2 == 1) {
            return "" + word.charAt(middleLetter);
        } else {
            return "" + word.charAt(middleLetter - 1) + word.charAt(middleLetter);
        }
    }
}
