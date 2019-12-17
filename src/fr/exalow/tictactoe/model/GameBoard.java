package fr.exalow.tictactoe.model;

public class GameBoard {

    private char[][] board = new char[3][3];

    public void initialize() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void display() {
        System.out.println("\n    0   1   2");
        System.out.println("  -------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; j++) {
                System.err.print(board[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("  -------------");
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public void setTokenAtPos(char token, Point position) {
        board[position.getX()][position.getY()] = token;
    }
}
