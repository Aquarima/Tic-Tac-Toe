package fr.exalow.tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new TicTacToe(new Player(sc.nextLine(), 'O'), new Player(sc.nextLine(), 'X'));
    }
}
