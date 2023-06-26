package playersGuide.day21;

import java.util.Scanner;

public class CreateArrow {
    Scanner scanner = new Scanner(System.in);
    Arrowhead arrowhead = null;
    Fletching fletching = null;

    void run() {
        System.out.println("Welcome. Vin Fletcher can make an arrow for you.\n" +
                "You can choose between standard arrows or custom-ordered arrows.");
        String choice = scanner.nextLine();
        System.out.println("You have chosen: " + choice);
        if (choice.equalsIgnoreCase("standard arrow")) {
            createStandardArrow();
        }
        if (choice.equalsIgnoreCase("custom-ordered arrow")) {
            createCustomArrow();
        }
    }

    void createStandardArrow() {
        System.out.println("The standard arrows are the elite arrow, the beginner arrow and the marksman arrow.");
        String standardArrow = scanner.nextLine();
        switch (standardArrow) {
            case "elite arrow":
                Arrow eliteArrow = Arrow.createEliteArrow();
                System.out.println("The arrowhead is: " + eliteArrow.arrowhead
                        + "\nthe fletching is: " + eliteArrow.fletching
                        + "\nthe length is: " + eliteArrow.length);
                break;
            case "beginner arrow":
                Arrow beginnerArrow = Arrow.createBeginnerArrow();
                System.out.println("The arrowhead is: " + beginnerArrow.arrowhead
                        + "\nthe fletching is: " + beginnerArrow.fletching
                        + "\nthe length is: " + beginnerArrow.length);
                break;
            case "marksman arrow":
                Arrow marksmanArrow = Arrow.createMarksmanArrow();
                System.out.println("The arrowhead is: " + marksmanArrow.arrowhead
                        + "\nthe fletching is: " + marksmanArrow.fletching
                        + "\nthe length is: " + marksmanArrow.length);
                break;
        }
    }

    void createCustomArrow() {
        System.out.println("Please select a type of wood.\nYou can choose between obsidian, steel and wood.");
        String choiceArrowHead = scanner.nextLine().toLowerCase();
        switch (choiceArrowHead) {
            case "obsidian":
                arrowhead = Arrowhead.OBSIDIAN;
                break;
            case "steel":
                arrowhead = Arrowhead.STEEL;
                break;
            case "wood":
                arrowhead = Arrowhead.WOOD;
                break;
        }

        System.out.println("Please select a type of arrow.\nYou can choose between plastic, goose feathers and turkey feathers.");
        String choiceFletching = scanner.nextLine().replaceAll("\\s", "_");
        switch (choiceFletching) {
            case "plastic":
                fletching = Fletching.PLASTIC;
                break;
            case "goose_feathers":
                fletching = Fletching.GOOSE_FEATHERS;
                break;
            case "turkey_feathers":
                fletching = Fletching.TURKEY_FEATHERS;
                break;
        }

        System.out.println("Please say how long the arrow should be.");
        double length = scanner.nextDouble();

        Arrow newArrow = new Arrow(arrowhead, fletching, length);

        System.out.println("We have created a new arrow:" + "\nthe arrowhead is: " + newArrow.arrowhead +
                "\nthe fletching is: " + newArrow.fletching + "\nthe length is : " + newArrow.length);
        System.out.println("The cost of this arrow is " + newArrow.getCost() + ".");
    }

}


