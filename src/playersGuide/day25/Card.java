package playersGuide.day25;

import java.util.Arrays;

public class Card {

    private CardColours cardColour;
    private CardRanks cardRank;

    public Card(CardColours cardColour, CardRanks cardRank) {
        this.cardColour = cardColour;
        this.cardRank = cardRank;
    }

    void numberOrSymbolCard() {
        if (cardRank.equals(CardRanks.ONE)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.TWO)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.THREE)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.FOUR)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.FIVE)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.SIX)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.SEVEN)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.EIGHT)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.NINE)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.TEN)) {
            System.out.println("The card is a number card");
        }
        if (cardRank.equals(CardRanks.DOLLAR_SIGN)) {
            System.out.println("The card is a symbol card");
        }
        if (cardRank.equals(CardRanks.PERCENTAGE_SIGN)) {
            System.out.println("The card is a symbol card");
        }
        if (cardRank.equals(CardRanks.ACCENT_CIRCONFLEXE)) {
            System.out.println("The card is a symbol card");
        }
        if (cardRank.equals(CardRanks.AMPERSAND)) {
            System.out.println("The card is a symbol card");
        }
    }

    public static void main(String[] args) {
        CardColours[] cardColours = CardColours.values();
        CardRanks[] cardRanks = CardRanks.values();
        for (CardColours coloursLoop : cardColours
        ) {
            for (CardRanks ranksLoop : cardRanks
            ) {
                System.out.println("The " + coloursLoop + " " + ranksLoop);
            }
        }
    }
}
