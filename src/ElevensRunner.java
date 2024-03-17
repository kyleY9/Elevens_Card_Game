import java.util.*;
public class ElevensRunner {
    public static void main(String[] args) {
        // run this code to actually play the game!
        ElevensBoard board = new ElevensBoard();
        board.newGame();
        System.out.println("Welcome to Elevens, try your best as this game is quite hard!");
        System.out.println("Cards left to be dealt: " + board.deckSize());

        while (!(board.gameIsWon())) {
            System.out.println("\nCurrent cards on the field:\n" + board);
            ArrayList<Integer> inputList = new ArrayList<Integer>();
            Scanner scan = new Scanner(System.in);

            while (board.anotherPlayIsPossible() && !board.isLegal(inputList)) {
                int sizeOfArr = 0;
                String[] inputArr = null;
                inputList = new ArrayList<Integer>();
                while (sizeOfArr != 2 && sizeOfArr != 3) {
                    System.out.print("Please enter the indexes of the cards you wish to remove, separated by a space (Ex:1 2): ");
                    inputArr = scan.nextLine().split(" ");
                    sizeOfArr = inputArr.length;
                }
                System.out.print("Chosen Cards: ");
                for (String str : inputArr) {
                    // System.out.println("DEBUGGIN'");
                    System.out.print(board.cardAt(Integer.parseInt(str)) + " ");
                    inputList.add(Integer.parseInt(str));
                }
                if (!board.isLegal(inputList)) {
                    System.out.println("\nThe cards you've chosen do NOT add up to 11. Choose again ...");
                }
            }
            // after getting past the "isLegal()" gateway ...
            System.out.println();
            board.replaceSelectedCards(inputList);
            System.out.println("There are " + board.deckSize() + " undealt cards remaining.");

            // if there are no more legal plays, and you haven't won yet, that means you lose D:
            if (!board.anotherPlayIsPossible() && !board.gameIsWon()) {
                System.out.println("\n" + board);
                System.out.println("No more plays are possible. GAME OVER.");
                System.exit(0); // terminates the program without returning anything
            }
        }
        // if you get past all of those while loops, it means you have won!
        System.out.println("You have beat the game! VICTORY! :D");
    }
}
