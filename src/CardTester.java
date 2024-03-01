/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("10", "Spades", 10);
        Card card2 = new Card("Ace", "Hearts", 1);
        Card card3 = new Card("Ace", "Diamonds", 1);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("Is card1 equal to card2? " + card1.isEqual(card2));
    }
}