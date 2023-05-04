package simpleExercises.size10;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 133));
    }

    private static boolean lastDigit(int firstNumber, int secondNumber){
        return firstNumber % 10 == secondNumber % 10;
    }

}
