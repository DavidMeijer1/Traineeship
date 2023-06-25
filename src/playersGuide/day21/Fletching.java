package playersGuide.day21;

enum Fletching {
    PLASTIC(10), TURKEY_FEATHERS(5), GOOSE_FEATHERS(3);

    private final double price;

    Fletching(double price) {
        this.price = price;
    }

    public double getPrice(double price) {
        return price;
    }
}
