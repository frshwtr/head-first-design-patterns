package uk.frshwtr.DecoratorPattern.Condiment;

import uk.frshwtr.DecoratorPattern.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
