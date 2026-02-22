package br.edu.insper.desagil.aps3.horizon;

public abstract class Region {
    private String name;

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();
}
