package uk.frshwtr.IteratorPattern;

import uk.frshwtr.IteratorPattern.MenuComponent;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print("  " + getName());
        if(isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", "  + getPrice());
        System.out.println("    -- " + getDescription());
    }

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}