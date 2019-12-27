package fr.exalow.tictactoe.model;

import java.util.Scanner;

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
        System.out.println("\nCurrent board layout :");
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
        Scanner scan = new Scanner(System.in);
        while (board[x][y] != ' ' || x > 2 || x < 0 || y > 2 || y < 0) {
            if (board[x][y] != ' ') System.out.println("\nThis case is already in use, Please choose an other !");
            if (x > 2 || x < 0 || y > 2 || y < 0) System.out.println("\nInvalid coordinates, Please choose an other !");

            System.out.print("(x:y): ");
            String[] input = scan.nextLine().split(":");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
        }
        board[x][y] = token;
    }
}
