package javaForBeginners.Chapter2;

public class CastDemo {
    public static void main(String[] args) {
        double doubleNumber1 = 10.0;
        double doubleNumber2 = 15.0;

        int integerNumber = (int) (doubleNumber1 * doubleNumber2);
        System.out.println(integerNumber);
    }
}
