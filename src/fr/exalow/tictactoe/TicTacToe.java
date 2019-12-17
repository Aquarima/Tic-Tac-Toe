package fr.exalow.tictactoe;

import fr.exalow.tictactoe.model.Player;
import fr.exalow.tictactoe.model.Point;
import fr.exalow.tictactoe.model.GameBoard;

import java.util.Scanner;

public class TicTacToe {

    private GameBoard board = new GameBoard();

    private Player currentPlayer;
    private Player player1;
    private Player player2;

    public TicTacToe(Player p1, Player p2) {
        this.currentPlayer = p1;
        this.player1 = p1;
        this.player2 = p2;
        board.initialize();
    }

    public void run() {

        final Scanner sc = new Scanner(System.in);

        while (!isGameOver()) {
            board.display();

            Point position;

            do {
                System.out.print("\n" + currentPlayer.getName() + " [" + currentPlayer.getToken() + "] Coordinates '0:0' : ");
                String[] args = sc.nextLine().split(":");
                position = new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            } while (!board.setTokenAtPos(currentPlayer.getToken(), position));
            currentPlayer.addConqueredPoint(position);
            switchCurrentPlayer();
        }
        stop();
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
            return;
        }
        currentPlayer = player1;
    }

    private boolean isGameOver() {
        return board.isFull() || currentPlayer.checkForWin();
    }

    private void stop() {
        if (board.isFull()) {
            System.out.println("\nThe game is a tie !");
            return;
        }
        System.out.println("\n" + currentPlayer.getName() + " Have wins the game !");
    }
}
