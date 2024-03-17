import java.util.*;

public class ElevensBoardTester
{
    public static void main(String[] args)
    {
        // "I_AM_DEBUGGING is set to true
        ElevensBoard test = new ElevensBoard();

        System.out.println("1. Intial Constructor: \n"+test);

        test.newGame();
        System.out.println("2. After starting a new game\n"+test);

        System.out.println("3. Size of board = "+test.size());

        System.out.println("4. isEmpty() = "+test.isEmpty()); // should not be empty >:(

        test.deal(1);
        test.deal(2);
        test.deal(3);
        System.out.println(test);

        System.out.println("5. deckSize() = "+test.deckSize());
        test.deal(4);
        System.out.println("Deck should have been decremented = "+ test.deckSize());

        System.out.println("Should print the card at index 5 = "+ test.cardAt(5));

        ArrayList<Integer>  dealt = new ArrayList<Integer>();
        dealt.add(5);
        dealt.add(6);
        test.replaceSelectedCards(dealt);
        System.out.println("Cards at index 5 and 6 should be new");
        System.out.println(test);

        System.out.println("Print out all the non-null elements' indexes = "+ test.cardIndexes());

        // Let's test out the toString() method
        System.out.println("toString() =  "+ test.toString());

        // We aren't even playing the game officially: should return FALSE!
        System.out.println("gameIsWon() = "+ test.gameIsWon());

        // Probably returns false, but let's see ...
        System.out.println("isLegal(l) = "+ test.isLegal(dealt));

        // Probably should return true, but maybe I'll be unlucky
        System.out.println("anotherPlayIsPossible() == "+ test.anotherPlayIsPossible());


        // "The last two we have already tested with "anotherPlayIsPossible() ... I think
        //were done here.  Phew that's a lot of work!  What kind of teacher would make their
        //student do all that work?"
        // Yeah, I would feel bad for anyone who has THAT kind of teacher, right?
    }
}