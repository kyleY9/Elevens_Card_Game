/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"Ace", "10", "5"};
        String[] suits = {"Diamonds", "Clubs", "Spades"};
        int[] values = {1, 10, 5};

        Deck deck = new Deck(ranks, suits, values);
        System.out.println(deck);

        System.out.println("\nDeal Out Card 1: " + deck.deal());
        System.out.println("Deal Out Card 2: " + deck.deal());
        System.out.println("There are " + deck.size() + " cards left to be dealt out of " + deck.totalCards());
    }
}
