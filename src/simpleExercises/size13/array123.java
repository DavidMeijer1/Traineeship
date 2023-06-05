package simpleExercises.size13;

public class array123 {
    public static void main(String[] args) {
        System.out.println(array123(1, 1, 2, 3, 1));
        System.out.println(array123(1, 1, 2, 4, 1));
        System.out.println(array123(1, 1, 2, 1, 2, 3));
    }

    private static boolean array123(int... numbers) {
        for (int i = 0; i < numbers.length-2; i++) {
            if (numbers[i] == 1 && numbers[i + 1] == 2 && numbers[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }
}