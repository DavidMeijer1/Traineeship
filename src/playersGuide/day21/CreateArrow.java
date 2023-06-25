package playersGuide.day21;

import java.util.Scanner;

public class CreateArrow {
    Scanner scanner = new Scanner(System.in);
    Arrowhead arrowhead = null;
    Fletching fletching = null;

    void run() {
        System.out.println("Welcome. Vin Fletcher can make an arrow for you.\n" +
                "You can choose between standard arrows or custom-ordered arrows.");
        String choice = scanner.next();
        if (choice == "standard arrow") {
            createStandardArrow();
        }
        if (choice == "custom-ordered arrow") {
            createStandardArrow();
        }
    }

    void createStandardArrow() {
        System.out.println("The standard arrows are the elite arrow, the beginner arrow and the marksman arrow.");
        String standardArrow = scanner.next();
        switch (standardArrow) {
            case "elite arrow":
                Arrow.createEliteArrow();
            case "beginner arrow":
                Arrow.createBeginnerArrow();
            case "marksman arrow":
                Arrow.createMarksmanArrow();
        }
    }

    void createCustomArrow() {
        System.out.println("Please select a type of wood.\nYou can choose between obsidian, steel and wood.");
        String choiceArrowHead = scanner.next().toLowerCase();
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
        String choiceFletching = scanner.next().replaceAll("\\s", "_");
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


