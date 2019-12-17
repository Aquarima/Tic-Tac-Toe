package fr.exalow.tictactoe.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private List<Point> conqueredPoints = new ArrayList<>();
    private String name;
    private char token;

    public Player(String name, char token) {
        this.name = name;
        this.token = token;
    }

    public boolean checkForWin() {

        final List<List<Point>> validPoints = new ArrayList<>();
        validPoints.add(Arrays.asList(new Point(0, 0), new Point(0, 1), new Point(0, 2)));
        validPoints.add(Arrays.asList(new Point(1, 0), new Point(1, 1), new Point(1, 2)));
        validPoints.add(Arrays.asList(new Point(2, 0), new Point(2, 1), new Point(2, 2)));
        validPoints.add(Arrays.asList(new Point(0, 0), new Point(1, 0), new Point(2, 2)));
        validPoints.add(Arrays.asList(new Point(0, 1), new Point(1, 1), new Point(2, 1)));
        validPoints.add(Arrays.asList(new Point(0, 2), new Point(1, 2), new Point(2, 2)));
        validPoints.add(Arrays.asList(new Point(0, 0), new Point(1, 1), new Point(2, 2)));
        validPoints.add(Arrays.asList(new Point(2, 0), new Point(1, 1), new Point(0, 2)));

        for (int i = 0; i < validPoints.size(); i++) {
            if (conqueredPoints.containsAll(validPoints.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void addConqueredPoint(Point point) {
        conqueredPoints.add(point);
    }

    public String getName() {
        return name;
    }

    public char getToken() {
        return token;
    }
}
