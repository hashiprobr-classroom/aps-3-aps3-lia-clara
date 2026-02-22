package br.edu.insper.desagil.aps3.horizon;

public class Unit {
    private int width;
    private int height;

    public Unit(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int left(Point p) {
        return p.getX() - width / 2;
    }

    public int right(Point p) {
        return p.getX() + width / 2;
    }

    public int top(Point p) {
        return p.getY() - height / 2;
    }

    public int bottom(Point p) {
        return p.getY() + height / 2;
    }
}
