import java.util.*;
public class ElevensRunner {
    public static void main(String[] args) {
        // run this code to actually play the game!
        ElevensBoard board = new ElevensBoard();
        board.newGame();
        System.out.println("Welcome to Elevens, try your best as this game is quite hard!");
        System.out.println("Cards left to be dealt: " + board.deckSize());

        System.out.println(board);
        while (!(board.gameIsWon())) {
            System.out.println("Current cards on the field:\n" + board);
            int sizeOfArr = 0;
            String[] inputArr = null;
            ArrayList<Integer> inputList = null;
            Scanner scan = new Scanner(System.in);

            while (board.anotherPlayIsPossible() && !board.isLegal(inputList)) {
                while (sizeOfArr != 2 && sizeOfArr != 3) {
                    System.out.println("Please enter the indexes of the cards you wish to remove, separated by a space (Ex: 1 2)");
                    inputArr = scan.nextLine().split(" ");
                    sizeOfArr = inputArr.length;
                }
                System.out.print("Chosen Cards: ");
                for (String str : inputArr) {
                    System.out.print(board.cardAt(Integer.getInteger(str)));
                    inputList.add(Integer.getInteger(str));
                }
            }
        }
    }
}
