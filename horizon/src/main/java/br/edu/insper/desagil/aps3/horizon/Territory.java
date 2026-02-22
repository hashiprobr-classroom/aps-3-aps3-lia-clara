package br.edu.insper.desagil.aps3.horizon;

import java.util.ArrayList;
import java.util.List;

public class Territory extends Region {
    private List<SubTerritory> subTerritories;

    public Territory(String name, List<SubTerritory> subTerritories) {
        super(name);
        this.subTerritories = subTerritories;
    }

    public List<Unit> subGoals() {
        List<Unit> goals = new ArrayList<>();
        for (SubTerritory subTerritory : subTerritories) {
            goals.add(subTerritory.getGoal());
        }
        return goals;
    }

    @Override
    public double area() {
        double s = 0;
        for (SubTerritory subTerritory : subTerritories) {
            s += subTerritory.area();
        }
        return s;
    }
}
