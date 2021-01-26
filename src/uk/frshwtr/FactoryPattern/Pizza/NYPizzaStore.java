package uk.frshwtr.FactoryPattern.Pizza;

import uk.frshwtr.FactoryPattern.Pizza.Ingredients.NYPizzaIngredientFactory;
import uk.frshwtr.FactoryPattern.Pizza.Ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            return new CheezePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("pepperoni")) {
            return new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equals("clam")) {
            return new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("veggie")) {
            return new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else return null;
    }
}
