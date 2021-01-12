package uk.frshwtr.DecoratorPattern.Beverage;

public class HouseBlend extends Espresso {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
