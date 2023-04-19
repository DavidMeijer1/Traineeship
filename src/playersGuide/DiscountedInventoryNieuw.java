package playersGuide;

import java.util.List;

class InventoryItem {

    private String name;
    private double price;

    public InventoryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

public class DiscountedInventoryNieuw {
    public static void main(String[] args) {
        List<InventoryItem> inventory = List.of(
                new InventoryItem("rope", 10.0),
                new InventoryItem("Canoe", 200.0)
                );
        for (int i = 0; i < inventory.size(); i++) {
            var item = inventory.get(i);
            System.out.printf("%d. %s is %.2f%n", i + 1, item.getName(), item.getPrice());
        }
        System.out.println("With discount!");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i + 1 + ". " + inventory.get(i).getName() + " is " + inventory.get(i).getPrice() / 2);
        }
    }
}