package simpleExercises.size10;

public class In1020 {
    public static void main(String[] args) {
        System.out.println(in2020(12, 99));
        System.out.println(in2020(21, 12));
        System.out.println(in2020(8, 99));
    }

    private static boolean in2020(int firstNumber, int secondNumber){
        return (firstNumber >= 10 && firstNumber <= 20) || (secondNumber >= 10 && secondNumber <= 20);
    }
}
