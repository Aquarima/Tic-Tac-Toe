package fr.exalow.tictactoe;

import fr.exalow.tictactoe.model.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Player 1, Enter your name : ");
        String pOneName = scan.nextLine();
        System.out.print("Player 2, Enter your name : ");
        String pTwoName = scan.nextLine();

        new TicTacToe(new Player(pOneName, 'X'), new Player(pTwoName, 'O')).run();
    }
}
