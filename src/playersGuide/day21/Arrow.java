package playersGuide.day21;

public class Arrow {
    final double length;
    final Fletching fletching;
    final Arrowhead arrowhead;

    public float getCostArrowhead() {
        return costArrowhead;
    }

    public float getCostFletching() {
        return costFletching;
    }

    private float costArrowhead;
    private float costFletching;

    public Arrow(Arrowhead arrowhead, Fletching fletching, double length) {
        this.fletching = fletching;
        this.arrowhead = arrowhead;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public Fletching getFletching() {
        return fletching;
    }

    public Arrowhead getArrowhead() {
        return arrowhead;
    }

    float getCost() {
        if (arrowhead == Arrowhead.OBSIDIAN) {
            costArrowhead = 5;
        } else if (arrowhead == Arrowhead.STEEL) {
            costArrowhead = 10;
        } else if (arrowhead == Arrowhead.WOOD) {
            costArrowhead = 3;
        }

        if (fletching == Fletching.PLASTIC) {
            costFletching = 10;
        } else if (fletching == Fletching.TURKEY_FEATHERS) {
            costFletching = 5;
        } else if (fletching == Fletching.GOOSE_FEATHERS) {
            costFletching = 3;
        }

        double costLength = length * 0.05;
        return (float) (costArrowhead + costFletching + costLength);
    }

    public static Arrow createEliteArrow() {
        Arrow eliteArrow = new Arrow(Arrowhead.STEEL, Fletching.PLASTIC, 95.0);
        System.out.println("An elite arrow has been created.");
        return eliteArrow;
    }

    public static Arrow createBeginnerArrow() {
        Arrow beginnerArrow = new Arrow(Arrowhead.WOOD, Fletching.PLASTIC, 75.0);
        System.out.println("A beginner's has been created.");
        return beginnerArrow;
    }

    public static Arrow createMarksmanArrow() {
        Arrow marksmanArrow = new Arrow(Arrowhead.STEEL, Fletching.GOOSE_FEATHERS, 65.0);
        System.out.println("A marksman arrow has been created.");
        return marksmanArrow;
    }

}
