package playersGuide.day24;

public class Colour {
    private int red;
    private int green;
    private int blue;

    Colour(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    final static Colour WHITE = new Colour(255, 255, 255);
    final static Colour BLACK = new Colour(0, 0, 0);
    final static Colour RED = new Colour(255, 0, 0);
    final static Colour ORANGE = new Colour(255, 165, 0);
    final static Colour YELLOW = new Colour(255, 255, 0);
    final static Colour GREEN = new Colour(0, 128, 0);
    final static Colour BLUE = new Colour(0, 0, 255);
    final static Colour PURPLE = new Colour(128, 0, 128);

    public String toString() {
        return " red is " + red + ", green is " + green + " and blue is " + blue;
    }

    public static void main(String[] args) {
        Colour azureBlue = new Colour(0, 127, 255);
        System.out.println("The colour azure blue has been created.");
        Colour blue = Colour.BLUE;
        System.out.println("The colour blue has been created.");
        System.out.println("The red, green and blue channel values of azure blue are:" + azureBlue + "." +
                "\nThe red, green and blue channel values of blue are:" + blue + ".");
    }

}
