package playersguide.day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day14ChallengeTheReplicator {
    public static void main(String[] args) {

        int[] firstArray = new int[5];

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Please give five numbers.");

        int number1 = inputKeyboard.nextInt();
        int number2 = inputKeyboard.nextInt();
        int number3 = inputKeyboard.nextInt();
        int number4 = inputKeyboard.nextInt();
        int number5 = inputKeyboard.nextInt();

        firstArray[0] = number1;
        firstArray[1] = number2;
        firstArray[2] = number3;
        firstArray[3] = number4;
        firstArray[4] = number5;

        int[] secondArray = new int[5];

        System.arraycopy(firstArray, 0, secondArray, 0, 5);

        for (int i=0; i<5; i++) {
            secondArray[i] = firstArray[i];
        }

        System.out.println("The first array is: "+Arrays.toString(firstArray));
        System.out.println("The second array is: "+Arrays.toString(secondArray));
    }
}