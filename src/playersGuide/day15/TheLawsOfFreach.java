package playersGuide.Day15;

public class TheLawsOfFreach {
    public static void main(String[] args) {

        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE;

        for (int number: array
             ) {
            if(number < currentSmallest){
                currentSmallest = number;
            }
            System.out.println(currentSmallest);
        }

        int total = 0;
        for (int number: array
             ) {
            total += number;
            System.out.println(total);
        }
        System.out.println((double) total / array.length);
    }
}
