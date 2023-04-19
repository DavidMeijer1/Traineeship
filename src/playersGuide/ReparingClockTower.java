package playersGuide;

import java.util.Scanner;

public class ReparingClockTower {

    public static void main(String[] args) {

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("What is the number?");
        int number = inputKeyboard.nextInt();
        System.out.println(number);

        if(number%2==0)
            System.out.println("Tick: the number "+number+" is even.");
        else
            System.out.println("Tock: the number "+number+" is uneven.");
    }

}
