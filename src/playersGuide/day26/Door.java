package playersGuide.day26;

//import static playersGuide.day26.DoorState.*;

import java.util.Scanner;

import static playersGuide.day26.DoorState.*;

public class Door {
    Scanner scanner = new Scanner(System.in);
    static final DoorState open = OPEN;
    static final DoorState closed = CLOSED;
    static final DoorState locked = LOCKED;
    private DoorState doorState;

    private int numericPasscode;

    private int newNumericPasscode;

    public DoorState getDoorState() {
        return doorState;
    }

    String open() {
        if (doorState == locked) {
            return "The door is locked. You have to unlock it first.";
        } else if (doorState == closed) {
            doorState = open;
            return "The door has been opened.";
        } else {
            return "The door is already open.";
        }
    }

    String close() {
        if (doorState == open) {
            doorState = closed;
            return "The door has been closed.";
        } else if (doorState == closed) {
            return "The door is already closed.";
        } else {
            return "The door is already locked.";
        }
    }

    String lock() {
        if (doorState == open) {
            return "The door is open. You have to close it first.";
        } else if (doorState == closed) {
            doorState = locked;
            return "The door has been locked";
        } else if (doorState == locked) {
            return "The door is already locked";
        }
        return "Select an option";
    }

    String unlock() {
        if (doorState == open) {
            return "The door is open. You have to lock it first";
        } else if (doorState == closed) {
            return "The door is closed. You have to lock it first.";
        } else if (doorState == locked) {
            doorState = closed;
            return "The door has been unlocked";
        }
        return "Select an option";
    }

    public Door(int numericPasscode) {
        this.doorState = locked;
        this.numericPasscode = numericPasscode;
    }

    void changePassword(int numericPasscode, int newNumericPasscode) {
        int currentPasscode = scanner.nextInt();
        newNumericPasscode = scanner.nextInt();
        if (currentPasscode == numericPasscode) {
            numericPasscode = newNumericPasscode;
        }
    }

}
