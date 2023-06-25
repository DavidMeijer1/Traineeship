package playersGuide.day21;

enum Arrowhead {
    STEEL(2), WOOD(5), OBSIDIAN(10);

    private final double price;

    Arrowhead(double price) {
        this.price = price;
    }

    double getPrice(double price) {
        return price;
    }
}