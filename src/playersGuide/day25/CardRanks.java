package playersGuide.day25;

public enum CardRanks {
    ONE("One"), TWO("Two"), THREE("Three"), FOUR("Four"), FIVE("Five"), SIX("Six"),
    SEVEN("Seven"), EIGHT("Eight"), NINE("Nine"), TEN("Ten"), DOLLAR_SIGN("Dollar sign"),
    PERCENTAGE_SIGN("Percentage sign"), ACCENT_CIRCONFLEXE("Accent circonflexe"), AMPERSAND("Ampersand");

    public String getRank() {
        return rank;
    }

    private String rank;

    CardRanks(String rank) {
        this.rank = rank;
    }
}
