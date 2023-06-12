package playersGuide.day20;

import java.util.Scanner;

public class Soup {

    enum Type {
        SOUP, STEW, GUMBO
    }
    enum MainIngredient {
        MUSHROOM, CHICKEN, CARROT, POTATO
    }
    enum Seasoning {
        SPICY, SALTY, SWEET
    }

    void selectSoup() {
        Scanner scanner = new Scanner(System.in);

        Type type=null;
        MainIngredient mainIngredient = null;
        Seasoning seasoning = null;

        System.out.println("Please select a type of food.\nYou can choose between soup, stew and gumbo.");
        String choice = scanner.next();
        switch (choice) {
            case "soup":
                type = Type.SOUP;
                break;
            case "stew":
                type = Type.STEW;
                break;
            case "gumbo":
                type = Type.GUMBO;
                break;
        }

        System.out.println("Please select the main ingredient of the dish.\nYou can choose between mushroom, chicken, carrot and potato.");
        choice = scanner.next();
        if(choice.equals("mushroom")){
            mainIngredient = MainIngredient.MUSHROOM;
        } else if (choice.equals("chicken")) {
            mainIngredient = MainIngredient.CHICKEN;
        } else if (choice.equals("carrot")){
            mainIngredient = MainIngredient.CARROT;
        } else if (choice.equals("potato")) {
            mainIngredient = MainIngredient.POTATO;
        }

        System.out.println("Please select a seasoning for the dish.\nYou can choose between spicy, salty and sweet.");
        choice = scanner.next();
        if (choice.equals("spicy")){
            seasoning = Seasoning.SPICY;
        } else if (choice.equals("salty")){
            seasoning = Seasoning.SALTY;
        } else if (choice.equals("sweet")){
            seasoning = Seasoning.SWEET;
        }

        System.out.println(type+" "+mainIngredient+" "+seasoning);
    }
}
