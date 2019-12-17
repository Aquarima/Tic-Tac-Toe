package fr.exalow.tictactoe;

import fr.exalow.tictactoe.model.Player;

public class Main {

    public static void main(String[] args) {
        new TicTacToe(new Player("Joueur 1", 'O'), new Player("Joueur 2", 'X')).run();
    }
}
