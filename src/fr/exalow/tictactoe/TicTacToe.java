package fr.exalow.tictactoe;

public class TicTacToe {

    private GameBoard board = new GameBoard();
    private Player currentPlayer;
    private Player player1;
    private Player player2;

    public TicTacToe(Player player1, Player player2) {
        this.board.initialize();
        this.currentPlayer = player1;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        while (!isGameOver()) {
            board.print();
            switchCurrentPlayer();
        }

        if (board.isFull()) System.out.println("\nNobody won !");
    }

    public void switchCurrentPlayer() {
        if (currentPlayer == player1) currentPlayer = player2;
        if (currentPlayer == player2) currentPlayer = player1;
    }

    private boolean hasWinner() {
        if (board.parseRows() != null || board.parseColumns() != null || board.parseDiagonals() != null) {
            return true;
        }
        return false;
    }

    private boolean isGameOver() {
        if (hasWinner()) return true;
        if (board.isFull()) return true;
        return false;
    }
}
