package fr.exalow.tictactoe.model;

public class Board {

    private char[][] board = new char[3][3];

    public void initialize() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                board[x][y] = ' ';
            }
        }
    }

    public void print() {
        System.out.println("\n    0   1   2");
        System.out.println("  -------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("  -------------");
        }
        System.out.println();
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public boolean isWinner(Player player) {
        return isRowWinner(player) || isColumnWinner(player) || isDiagonalWinner(player);
    }

    public boolean isRowWinner(Player player) {
        return player.getToken() == board[0][0] && player.getToken() == board[0][1] && player.getToken() == board[0][2]
                || player.getToken() == board[1][0] && player.getToken() == board[1][1] && player.getToken() == board[1][2]
                || player.getToken() == board[2][0] && player.getToken() == board[2][1] && player.getToken() == board[2][2];
    }

    public boolean isColumnWinner(Player player) {
        return player.getToken() == board[0][0] && player.getToken() == board[1][0] && player.getToken() == board[2][2]
                || player.getToken() == board[0][1] && player.getToken() == board[1][1] && player.getToken() == board[2][1]
                || player.getToken() == board[0][2] && player.getToken() == board[1][2] && player.getToken() == board[2][2];
    }

    public boolean isDiagonalWinner(Player player) {
        return player.getToken() == board[0][0] && player.getToken() == board[1][1] && player.getToken() == board[2][2]
                || player.getToken() == board[2][0] && player.getToken() == board[1][1] && player.getToken() == board[0][2];
    }

    public void setTokenAtPos(char token, int x, int y) {
        board[x][y] = token;
    }
}
