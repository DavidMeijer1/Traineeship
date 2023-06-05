package simpleExercises.size15;

import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        run();
    }

    static int reverseAnInteger(int integer){
        String integerString = Integer.toString(integer);
        StringBuilder stringBuilder = new StringBuilder().reverse();
        for (int i = integerString.length()-1; i >= 0; i--) {
            char lastCharacter = integerString.charAt(i);
            stringBuilder.append(lastCharacter);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    static void run(){
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        System.out.println(reverseAnInteger(integer));
    }

}
