package levelSeven;

public class XAndO {
    public static void main(String[] args) {
        System.out.println(xAndO("xo"));
    }

    static boolean xAndO(String str) {
        char[] array = str.toLowerCase().toCharArray();
        int countX = 0;
        int countO = 0;
        for (char c : array) {
            if (c == 'x') {
                countX++;
            } else if (c == 'o')
                countO++;
        }
        return countX == countO;
    }
}
