package simpleExercises.size15;

public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    static boolean arrayFront9(int[] array){
        for (int i = 0; i < Math.min(4, array.length); i++) {
            if(array[i] == 9){
                return true;
            }
        }
        return false;
    }

}
