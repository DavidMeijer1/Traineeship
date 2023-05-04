package simpleExercises.size11;

public class SwapToVariables {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;

        System.out.printf("Before swapping a and b are %d and %d.\n", a, b);

        int temp = a;
        a = b;
        b = temp;

        System.out.printf("After swapping a and b are %d and %d.\n", a, b);
    }

}
