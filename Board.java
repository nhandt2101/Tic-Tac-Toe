
public class Board {
    private Cell[][] board;

    public Board() {
        board = new Cell[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j].getCellStatus() + " | ");

            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    boolean checkInput(int i, int j) {
        if (i >= 1 && i <= 3 && j >= 1 && j <= 3 && board[i - 1][j - 1].getCellStatus().equals(" ")) {
            return true;
        }
        return false;
    }

    void fillBoard(int rows, int colums, String fixStatus) {

        
            board[rows - 1][colums - 1].setCellStatus(fixStatus);
        

    }

    boolean checkForWinner() {
        for (int n = 0; n < 3; n++) {
            if ((board[n][0].getCellStatus() == "X" && board[n][1].getCellStatus() == "X" && board[n][2].getCellStatus() == "X") ||
                    (board[n][0].getCellStatus() == "O" && board[n][1].getCellStatus() == "O" && board[n][2].getCellStatus() == "O"))
                return true;
        }
        for (int n = 0; n < 3; n++) {
            if ((board[0][n].getCellStatus() == "X" && board[1][n].getCellStatus() == "X" && board[2][n].getCellStatus() == "X") ||
                    (board[0][n].getCellStatus() == "O" && board[1][n].getCellStatus() == "O" && board[2][n].getCellStatus() == "O"))
                return true;
        }
        if ((board[0][0].getCellStatus() == "X" && board[1][1].getCellStatus() == "X" && board[2][2].getCellStatus() == "X") ||
                (board[0][0].getCellStatus() == "O" && board[1][1].getCellStatus() == "O" && board[2][2].getCellStatus() == "O"))
            return true;
        if ((board[0][2].getCellStatus() == "X" && board[1][1].getCellStatus() == "X" && board[2][0].getCellStatus() == "X") ||
                (board[0][2].getCellStatus() == "O" && board[1][1].getCellStatus() == "O" && board[2][0].getCellStatus() == "O"))
            return true;
        return false;
    }

}