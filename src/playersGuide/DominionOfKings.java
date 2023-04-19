package playersGuide;

import java.util.Scanner;

public class DominionOfKings {
   public static void main(String[] args) {

        int estates, duchies, provinces;

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("How many estates do you have?");
        estates = inputKeyboard.nextInt();
        System.out.println("How many duchies do you have?");
        duchies = inputKeyboard.nextInt();
        System.out.println("How many provinces do you have?");
        provinces = inputKeyboard.nextInt();

        int score = estates+duchies*3+provinces*6;

        System.out.println("You have "+score+" points.");

    }
}
