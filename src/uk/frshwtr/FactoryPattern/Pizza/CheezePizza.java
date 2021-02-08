package uk.frshwtr.FactoryPattern.Pizza;

import uk.frshwtr.FactoryPattern.Pizza.Ingredients.PizzaIngredientFactory;

public class CheezePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheezePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " +  name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
