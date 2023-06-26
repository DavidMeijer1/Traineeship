package playersGuide.day25;

public enum CardColours {
    RED("Red"), GREEN("Green"), BLUE("Blue"), YELLOW("Yellow");

    public String getColour() {
        return colour;
    }

    String colour;

    CardColours(String colour) {
        this.colour = colour;
    }
}
