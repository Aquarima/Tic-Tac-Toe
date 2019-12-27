package fr.exalow.tictactoe.model;

public class Player {

    private String name;
    private char token;

    public Player(String name, Character token) {
        this.name = name;
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public char getToken() {
        return token;
    }
}
