package levelSeven;

public class NextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(121));
        System.out.println(nextPerfectSquare(625));
        System.out.println(nextPerfectSquare(114));
    }

    static long nextPerfectSquare(long number) {
        long[] array = new long[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (long) Math.pow(i, 2);
        }

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return array[i + 1];
            }
        }
        return -1;
    }
}

