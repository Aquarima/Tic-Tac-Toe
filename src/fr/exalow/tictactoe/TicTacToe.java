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

        pOne = new Player("Exalow", 'X');
        pTwo = new Player("BOT", 'O');

        this.currentPlayer = pOne;
    }

    public void run() {
        board.initialize();
        while (true) {

            board.print();

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter coordinates separated by a ':' : ");
            String[] input = scan.nextLine().split(":");
            board.setTokenAtPos(currentPlayer.getToken(), Integer.parseInt(input[0]), Integer.parseInt(input[1]));

            if (isGameOver()) {

                if (board.isFull()) {
                    System.out.println("The Game was a tie !");
                    return;
                }

                System.out.println("Player " + currentPlayer.getName() + " has won the game !");
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
