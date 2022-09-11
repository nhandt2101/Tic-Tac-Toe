
import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        boolean run = true;
        int turns = 0;
        System.out.println("Let's play game");
        board.printBoard();
        while (true) {

            System.out.println("X turn:");
            int i, j;
            while (true) {
                i = sc.nextInt();
                j = sc.nextInt();
                if (board.checkInput(i, j)) {
                    break;
                } else {
                    System.out.println("Cannot push X to this cell, please try again.");
                    board.printBoard();
                    System.out.println("X turn");
                }
            }
            board.fillBoard(i, j, "X");
            turns++;
            board.printBoard();
            if (turns == 9 && !board.checkForWinner()) {
                System.out.println("It's a Draw!");
                break;
            }
            if (board.checkForWinner()) {
                System.out.println("Player X won!");
                break;
            }
            System.out.println("Y turn: ");
            int i2, j2;
            while (true) {
                i2 = sc.nextInt();
                j2 = sc.nextInt();
                if (board.checkInput(i2, j2)) {
                    break;
                } else {
                    System.out.println("Cannot push Y to this cell, please try again.");
                    board.printBoard();
                    System.out.println("Y turn: ");
                }
            }

            board.fillBoard(i2, j2, "O");

            turns++;
            board.printBoard();
            if (board.checkForWinner()) {
                System.out.println("Player Y won!");
                break;
            }

        }
        sc.close();
    }

}
