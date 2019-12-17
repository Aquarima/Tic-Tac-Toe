package fr.exalow.tictactoe;

import fr.exalow.tictactoe.model.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        System.out.println("(Player 1) Name : ");
        Player p1 = new Player(scan.nextLine(), 'X');
        System.out.println("(Player 1) Name : ");
        Player p2 = new Player(scan.nextLine(), 'O');

        new TicTacToe(p1, p2);
    }
}
