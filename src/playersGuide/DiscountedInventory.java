package playersGuide;

import java.util.Scanner;

public class DiscountedInventory {
    public static void main(String[] args) {

        System.out.println("1. Rope\n2. Torches \n3. Climbing equipment \n4. Clean water \n5. Machete \n6. Canoe \n7. Food supplies");
        System.out.println();

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Please select a number from the menu.");
        int numberFromMenu = inputKeyboard.nextInt();

        System.out.println("What is your name?");
        String name = inputKeyboard.nextLine();

        if (name.equals("David Meijer")) {

            switch (numberFromMenu) {
                case 1:
                    System.out.println("A rope costs 5 gold.");
                    break;
                case 2:
                    System.out.println("A torch costs 7.5 gold.");
                    break;
                case 3:
                    System.out.println("Climbing equipment costs 12.5 gold.");
                    break;
                case 4:
                    System.out.println("Clean water costs 0.5 gold.");
                    break;
                case 5:
                    System.out.println("A machete costs 10 gold.");
                    break;
                case 6:
                    System.out.println("A canoe costs 100 gold.");
                    break;
                case 7:
                    System.out.println("Food supplies cost 0.5 gold.");
                    break;
            }
        } else
            switch (numberFromMenu) {
                case 1:
                    System.out.println("A rope costs 10 gold.");
                    break;
                case 2:
                    System.out.println("A torch costs 15 gold.");
                    break;
                case 3:
                    System.out.println("Climbing equipment costs 25 gold.");
                    break;
                case 4:
                    System.out.println("Clean water costs 1 gold.");
                    break;
                case 5:
                    System.out.println("A machete costs 20 gold.");
                    break;
                case 6:
                    System.out.println("A canoe costs 200 gold.");
                    break;
                case 7:
                    System.out.println("Food supplies cost 1 gold.");
                    break;
            }
    }
}
