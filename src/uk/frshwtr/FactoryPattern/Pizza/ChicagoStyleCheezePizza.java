package uk.frshwtr.FactoryPattern.Pizza;

public class ChicagoStyleCheezePizza extends Pizza {
    public ChicagoStyleCheezePizza() {
        System.out.println("PETRIL");
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
