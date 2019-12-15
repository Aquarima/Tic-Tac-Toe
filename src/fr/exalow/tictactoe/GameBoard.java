package fr.exalow.tictactoe;

public class GameBoard {

    private char[][] board = new char[3][3];

    public void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void print() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public Character parseRows() {
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            return board[0][0];
        }

        if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            return board[1][0];
        }

        if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            return board[2][0];
        }
        return null;
    }

    public Character parseColumns() {
        if (board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            return board[0][0];
        }

        if (board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            return board[0][1];
        }

        if (board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            return board[0][2];
        }
        return null;
    }

    public Character parseDiagonals() {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return board[2][0];
        }
        return null;
    }
}
