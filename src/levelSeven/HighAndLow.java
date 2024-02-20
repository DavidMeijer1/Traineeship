package levelSeven;

public class HighAndLow {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }

    static String highAndLow(String str) {
        String[] array = str.split(" ");
        int lowestNumber = Integer.parseInt(array[0]);
        int highestNumber = Integer.parseInt(array[0]);
        for (int i = 0; i < array.length; i++)
            if (Integer.parseInt(array[i]) < lowestNumber) {
                lowestNumber = Integer.parseInt(array[i]);
            }
        for (int i = 0; i < array.length; i++)
            if (Integer.parseInt(array[i]) > highestNumber) {
                highestNumber = Integer.parseInt(array[i]);
            }
        return highestNumber + " " + lowestNumber;
    }
}
