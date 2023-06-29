package playersGuide.day26;

//import static playersGuide.day26.DoorState.*;

import java.util.Scanner;

import static playersGuide.day26.DoorState.*;

public class Door {
    Scanner scanner = new Scanner(System.in);
    private static final DoorState open = OPEN;
    private static final DoorState closed = CLOSED;
    private static final DoorState locked = LOCKED;
    private DoorState doorState;

    private int numericPasscode = 123;
    private int newNumericPasscode;

    public int getNumericPasscode() {
        return numericPasscode;
    }

    public int getNewNumericPasscode() {
        return newNumericPasscode;
    }

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

    String unlock(int givenPasscode) {
        if (doorState == open) {
            return "The door is open. You have to lock it first";
        } else if (doorState == closed) {
            return "The door is closed. You have to lock it first.";
        } else if (doorState == locked) {
            if (givenPasscode == numericPasscode) {
                doorState = closed;
                return "The door has been unlocked";
            } else {
                return "That is not the correct passcode. Please give the correct passcode.";
            }
        }
        return "Select an option";
    }

    public Door(int numericPasscode) {
        this.doorState = locked;
        this.numericPasscode = numericPasscode;
    }

    String changePassword(int numericPasscode, int newNumericPasscode) {
        this.numericPasscode = newNumericPasscode;
        return "The passcode has been changed.";
    }
}