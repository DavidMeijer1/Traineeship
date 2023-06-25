package playersGuide.day19;

import java.util.Scanner;

public class SimulasTest {

    enum StateOfChest {
        OPEN, CLOSED, LOCKED
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StateOfChest open = StateOfChest.OPEN;
        StateOfChest closed = StateOfChest.CLOSED;
        StateOfChest locked = StateOfChest.LOCKED;

        System.out.println("The chest is " + locked + ". What do you want to do?");
        String choice = scanner.next();

        do {
            switch (choice) {
                case "open":
                    System.out.println("The chest is " + open + ". What do you want to do?");
                    break;
                case "close":
                    System.out.println("The chest is " + closed + ". What do you want to do?");
                    break;
                case "unlock":
                    System.out.println("The chest is " + closed + ". What do you want to do?");
                    break;
                case "lock":
                    System.out.println("The chest is " + locked + ". What do you want to do?");
                    break;
            }
            choice = scanner.next();
        }
        while (true);
    }
}