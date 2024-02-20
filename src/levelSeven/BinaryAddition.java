package levelSeven;

public class BinaryAddition {
    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
        System.out.println(binaryAddition(5, 9));
    }

    static String binaryAddition(int number1, int number2) {
        return Integer.toBinaryString(number1 + number2);
    }

}
