package playersGuide.day18;

import java.util.Scanner;

public class ManticoreHunting {
    private int manticoreHealth = 10;
    private int cityHealth = 15;
    private int round = 1;
    private int distance;
    Scanner scanner = new Scanner(System.in);

    void runGame() {
        askDistance();
        for (int i = 0; i < 10; i++) {
            display();
            shoot();
            if (manticoreHealth <= 0) {
                System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
                break;
            } else if (cityHealth <= 0) {
                System.out.println("The city is destroyed. The game is over.");
                break;
            }
        }
    }

    void askDistance() {
        System.out.println("What should the distance be?");
        distance = scanner.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    void display() {
        System.out.println("---------------------");
        System.out.println("STATUS: Round: " + round + " City: " + cityHealth + "/15 Manticore: " + manticoreHealth
                + "/10");
        System.out.println("The cannon is expected to deal " + damageCannon() + " damage this round.");
        cityHealth--;
        round++;
    }

    int damageCannon() {
        int damage;
        if (round % 15 == 0) {
            damage = 10;
        } else if (round % 5 == 0 || round % 3 == 0) {
            damage = 3;
        } else {
            damage = 1;
        }
        return damage;
    }

    void shoot() {
        System.out.println("How far do you want to shoot?");
        int range = scanner.nextInt();
        while (range != distance) {
            if (range > distance) {
                System.out.println("That round overshot the target");
                display();
                range = scanner.nextInt();
            } else if (range < distance) {
                System.out.println("That round fell short of the target");
                display();
                range = scanner.nextInt();
            }
        }
        System.out.println("That round was a direct hit!");
        manticoreHealth = manticoreHealth - damageCannon();
    }
}
