package uk.frshwtr.FactoryPattern.Pizza;

import java.util.ArrayList;

public abstract class Pizza implements PizzaCreation {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();
    public void bake() {
        System.out.println("Baking for 25 minutes at 350f");
    }

    public void cut() {
        System.out.println("Cutting pizza in diagonals");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString() {

    }
}
