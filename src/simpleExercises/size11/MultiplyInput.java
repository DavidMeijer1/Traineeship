package simpleExercises.size11;

public class MultiplyInput {
    public static void main(String[] args) {
        int firstNumber = 25;
        int secondNumber = 5;
        System.out.println("Input first number: 25");
        System.out.println("Input second number: 5");
        System.out.println("Expected output: \n" + multiply(firstNumber,secondNumber));
    }

    static int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }

}
