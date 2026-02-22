package br.edu.insper.desagil.aps3.horizon;

import java.util.HashMap;
import java.util.Map;

public class SubTerritory extends Region {
    private Unit goal;
    private Map<Point, Unit> units;

    public SubTerritory(String name, Unit goal) {
        super(name);
        this.goal = goal;
        this.units = new HashMap<>();
    }

    public Unit getGoal() {
        return goal;
    }

    public Map<Point, Unit> getUnits() {
        return units;
    }

    @Override
    public double area() {
        return hull();
    }

    private double hull() {
        return 0;
    }
}
