
package playersGuide.Day18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day18 {
    private static int cannonDamage;

    private static int manticoreHealth = 10;

    private static final int cityHealth = 15;

    private static int cannonRange;

    private static int distanceFromTheCity;

    private static final Scanner scanner = new Scanner(System.in);
//    static int round = 1;

    public static void main(String[] args) {
            runGame();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Player 1, how far away from the city do you want to station the manticore?");
//        distanceFromTheCity = scanner.nextInt();
//        manticorePosition(distanceFromTheCity);
////        System.out.print("\033[H\033[2J");
////        System.out.flush();
//        System.out.println("Player 2, it is your turn.");
//
//        for (int i = 0; i < 10; i++) {
//            if (manticoreHealth == 0 || cityHealth == 0) {
//                System.out.println("The game is over.");
//            }
//            System.out.println("----------------------");
//            //System.out.print("Status: Round " + round + "\n" + "City: " + cityHealth + "/15");
//            System.out.print(" Manticore " + manticoreHealth + "/10 ");
//            //System.out.println("The cannon is expected to deal " + getCannonDamage(round) + " damage this round.");
//            //System.out.println("Enter desired cannon range:");
//            cannonRange = scanner.nextInt();
//            manticoreHealth--;
//            if (manticoreHealth >= 1) {
//                cityHealth--;
//            }
//            //round++;
//        }
    }

    private static void runGame() {
        d:while (true) {
            mantiCoreTurn();

            for (int i = 1; i <=10; i++) {
                System.out.println(distanceFromTheCity+""+cannonRange);
                cannonTurns(i);
                if (gameOver()){
                    break d;
                }
            }
        }
    }

    private static int getCannonDamage(int rounds) {
        if (manticoreHit(distanceFromTheCity, cannonRange,rounds)) {
            System.out.println("yo");

            if (rounds%15==0) {
                cannonDamage = 10;
            } else if (rounds % 5 == 0) {
                cannonDamage = 5;
            } else if (rounds % 3 == 0) {
                cannonDamage = 3;
            } else if (0 == 0) {
                cannonDamage = 1;
            } else if (rounds==rounds) {
                cannonDamage = 3;
            }
            manticoreHealth -= cannonDamage;
            System.out.println(cannonDamage + " " +manticoreHealth);
            return cannonDamage;
        }
        return 0;
    }


    private static boolean manticoreHit(int mantiPosition, int cannonAim,int rounds) {
        if (mantiPosition == cannonAim) {
            System.out.println(manticoreHealth+" pre hit");
           return true;
        }
        return false;
    }

    private static boolean gameOver() {
        if (manticoreHealth <= 0 || cityHealth <= 0) {
            System.out.println("The manticore won \nThe game is over");
            return true;
        } else if (cityHealth <= 0) {
            System.out.println("The tower survived \nThe game is over");
            return  true;
        }
        return false;
    }

    private static void cannonTurns(int rounds) {
        playerTurnMessage(rounds);
        cannonRange = 0;
        cannonRange = inputErrorCheck();
        manticoreHit(distanceFromTheCity,cannonRange,rounds);
    }
    private static void mantiCoreTurn(){
        System.out.println("Player 1, how far away from the city do you want to station the manticore?");
        distanceFromTheCity = inputErrorCheck();
        System.out.println("Manticore position = "+distanceFromTheCity);
    }
    private static int inputErrorCheck() {
        int range;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number between 1 and 100");
                range = scanner.nextInt();
                if (range > 0 && range <= 100) {
                    System.out.println("range "+range);
                    return range;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Enter number please");
            }
        }
    }

    private static void playerTurnMessage(int rounds) {
        System.out.println("----------------------");
        System.out.print("Status: Round " + rounds + "\n" + "City: " + cityHealth + "/15");
        System.out.print(" Manticore " + manticoreHealth + "/10 ");
        System.out.println("The cannon is expected to deal " + getCannonDamage(rounds) + " damage this round.");
        System.out.println("Enter desired cannon range:");
    }

}
