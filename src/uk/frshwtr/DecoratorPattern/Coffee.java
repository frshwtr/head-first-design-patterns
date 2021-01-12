package uk.frshwtr.DecoratorPattern;

import uk.frshwtr.DecoratorPattern.Beverage.Beverage;
import uk.frshwtr.DecoratorPattern.Beverage.Espresso;
import uk.frshwtr.DecoratorPattern.Beverage.HouseBlend;
import uk.frshwtr.DecoratorPattern.Condiment.Mocha;

public class Coffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();

        System.out.println(espresso.getDescription());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);

        System.out.println(houseBlend.getDescription() + " £" + houseBlend.cost());
    }
}
