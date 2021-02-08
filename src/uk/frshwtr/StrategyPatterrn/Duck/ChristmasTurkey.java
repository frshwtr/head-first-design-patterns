package uk.frshwtr.StrategyPatterrn.Duck;

public class ChristmasTurkey implements Turkey {
    public void display() {
        System.out.println("I'm a Christmas turkey!");
    }

    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    public void fly() {
        System.out.println("I fly");
    }
}
