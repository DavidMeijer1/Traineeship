package playersGuide.day26;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoorManager {
    public static void main(String[] args) {
        System.out.println("Please give a starting passcode.");
        Scanner scanner = new Scanner(System.in);
        Door door = new Door(123);
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
                System.out.println("To unlock the door, you have to give the passcode.");
                int givenPasscode = scanner.nextInt();
                scanner.nextLine();
                System.out.println(door.unlock(givenPasscode));
            } else if (choice.equals("change passcode")) {
                System.out.println("To change the passcode, please give the current passcode first.");
                int givenPasscode = scanner.nextInt();
                scanner.nextLine();
                if (givenPasscode == door.getNumericPasscode()) {
                    System.out.println("Please give the new passcode.");
                    int newPasscode = scanner.nextInt();
                    scanner.nextLine();
                    door.setNumericPasscode(newPasscode);
                }
            }
        } while (true);
    }
}
