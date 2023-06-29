package playersGuide.day26;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoorManager {
    public static void main(String[] args) {
        System.out.println("Please give a starting passcode.");
        Scanner scanner = new Scanner(System.in);
        int passcode = scanner.nextInt();
        Door door = new Door(passcode);
        System.out.println("A door has been created.");
        do {
            System.out.println("The door is currently " + door.getDoorState() + ". What do you want to do?");
            String choice = scanner.nextLine();
            if (choice.equals("open")) {
                System.out.println(door.open());
            } else if (choice.equals("close")) {
                System.out.println(door.close());
            } else if (choice.equals("lock")) {
                System.out.println(door.lock());
            } else if (choice.equals("unlock")) {
                System.out.println("To unlock the door, you have to give the passcode");
                int givenPasscode = scanner.nextInt();
                if (givenPasscode == passcode) {
                    System.out.println(door.unlock());
                } else {
                    System.out.println("That is not correct. Please give a new passcode");
                }
            } else if (choice.equals("change passcode")) {
                System.out.println("To change the passcode, please give the current passcode first");
                int givenPasscode = scanner.nextInt();
                if (givenPasscode == passcode) {
                    System.out.println("Please give the new passcode");
                    int newPasscode = scanner.nextInt();
                    passcode = newPasscode;
                    System.out.println("The new passcode is " + passcode);
                } else {
                    System.out.println("That is not correct. Please give a new passcode.");
                }
            }
        } while (true);
    }
}
