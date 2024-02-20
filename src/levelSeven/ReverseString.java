package levelSeven;

public class ReverseString {

    public static void main(String[] args) {
        String str = null;
        solution(str);
    }

    static String solution(String str) {
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb.toString();
    }
}
