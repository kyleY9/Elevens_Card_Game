public class Card {
    // instance variable
    private int pointValue;
    private String rank;
    private String suit;

    // constructor
    public Card (String rank, String suit,int pointValue) {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
    // accessor methods
    public int getPointValue() {
        return pointValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // public methods
    public boolean isEqual(Card card) {
        return pointValue == card.getPointValue();
    }

    public String toString() {
        return rank + " " + suit;
    }
}
