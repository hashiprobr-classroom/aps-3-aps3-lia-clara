package br.edu.insper.desagil.aps3.horizon;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Point p) {
        return x == p.getX() && y == p.getY();
    }
}
