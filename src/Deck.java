import java.util.*;
public class Deck {
    // instance variables
    private ArrayList<Card> cards;
    private int size;

    // constructor
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        int iterator = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(ranks[j], suits[i], values[j]));
            }
        }
        size = cards.size();
    }

    // public methods
    public boolean isEmpty() {
        return size == 0;
    }

    // this method returns the amount of cards left to be dealt
    public int size() {
        return size;
    }
    // this method returns the total amount of cards in the deck. Does NOT change
    public int totalCards() {
        return cards.size();
    }

    public Card deal() {
        size--;
        return cards.get(size);
    }

    // toString method I wanted to implement
    public String toString() {
        String str = "[";
        for (Card card : cards) {
            str += card + ", ";
        }
        str += "]";
        return str;
    }
}

