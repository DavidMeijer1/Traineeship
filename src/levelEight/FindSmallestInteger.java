package levelEight;

public class FindSmallestInteger {
    public static void main(String[] args) {
        int[] array = new int[]{34, 15, 88, 2};
        System.out.println(findSmallestInteger(array));
    }

    static int findSmallestInteger(int[] array) {
        int smallestInteger = array[0];
        for (int j : array) {
            if (j < smallestInteger) {
                smallestInteger = j;
            }
        }
        return smallestInteger;
    }
}
