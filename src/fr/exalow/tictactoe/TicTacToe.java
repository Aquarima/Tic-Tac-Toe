package fr.exalow.tictactoe;

import fr.exalow.tictactoe.model.Board;
import fr.exalow.tictactoe.model.Player;

import java.util.Scanner;

public class TicTacToe {

    private Board board = new Board();

    private Player currentPlayer;
    private Player pOne;
    private Player pTwo;

    public TicTacToe() {
        this.pOne = new Player("Exalow", 'X');
        this.pTwo = new Player("BOT", 'O');
        this.currentPlayer = pOne;
    }

    public void run() {
        board.initialize();
        while (true) {

            board.print();

            Scanner scan = new Scanner(System.in);

            System.out.print(currentPlayer.getName() + ", Enter an empty row and column to place your mark format (x:y): ");
            String[] input = scan.nextLine().split(":");
            board.setTokenAtPos(currentPlayer.getToken(), Integer.parseInt(input[0]), Integer.parseInt(input[1]));

            if (isGameOver()) {

                if (board.isFull()) {
                    System.out.println("The Game was a tie !");
                    return;
                }

                System.out.println(currentPlayer.getName() + " has won the game !");
                break;
            }
            switchCurrentPlayer();
        }
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == pOne) {
            currentPlayer = pTwo;
            return;
        }
        currentPlayer = pOne;
    }

    private boolean isGameOver() {
        return board.isFull() || board.isWinner(currentPlayer);
    }
}
