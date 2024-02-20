package levelEight;

public class CountSheep {
    public static void main(String[] args) {
        System.out.println(countSheep(new boolean[]{true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true}));
    }

    static int countSheep(boolean[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                count++;
            }
        }
        return count;
    }

}
