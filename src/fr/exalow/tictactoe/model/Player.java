package fr.exalow.tictactoe.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private List<Point> conqueredPoints = new ArrayList<>();
    private List<List<Point>> winCases = new ArrayList<>();
    private String name;
    private char token;

    public Player(String name, char token) {
        this.name = name;
        this.token = token;
        winCases.add(Arrays.asList(new Point(0, 0), new Point(0, 1), new Point(0, 2)));
        winCases.add(Arrays.asList(new Point(1, 0), new Point(1, 1), new Point(1, 2)));
        winCases.add(Arrays.asList(new Point(2, 0), new Point(2, 1), new Point(2, 2)));
        winCases.add(Arrays.asList(new Point(0, 0), new Point(1, 0), new Point(2, 2)));
        winCases.add(Arrays.asList(new Point(0, 1), new Point(1, 1), new Point(2, 1)));
        winCases.add(Arrays.asList(new Point(0, 2), new Point(1, 2), new Point(2, 2)));
        winCases.add(Arrays.asList(new Point(0, 0), new Point(1, 1), new Point(2, 2)));
        winCases.add(Arrays.asList(new Point(2, 0), new Point(1, 1), new Point(0, 2)));
    }

    public boolean checkForWin() {
        for (int i = 0; i < winCases.size(); i++) {
            if (conqueredPoints.containsAll(winCases.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void addConqueredPoint(Point point) {
        conqueredPoints.add(point);
        System.out.println(conqueredPoints);
    }

    public String getName() {
        return name;
    }

    public char getToken() {
        return token;
    }
}
