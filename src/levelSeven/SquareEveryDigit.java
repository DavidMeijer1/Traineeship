package levelSeven;

public class SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareEveryDigit(9119));
    }

    static int squareEveryDigit(int number) {
        String temporaryString = String.valueOf(number);
        int[] array = new int[temporaryString.length()];
        for (int i = 0; i < temporaryString.length(); i++) {
            array[i] = temporaryString.charAt(i) - '0';
        }
        int[] resultArray = new int[temporaryString.length()];
        for (int i = 0; i < temporaryString.length(); i++) {
            resultArray[i] = array[i] * array[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : resultArray) {
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }
}

