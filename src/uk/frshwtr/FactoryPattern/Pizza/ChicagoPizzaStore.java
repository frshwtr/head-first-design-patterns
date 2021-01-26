package uk.frshwtr.FactoryPattern.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            System.out.println("CHEESE");
            return new ChicagoStyleCheezePizza();
        } else if (item.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (item.equals("clam")) {
            return new ClamPizza();
        } else if (item.equals("veggie")) {
            return new VeggiePizza();
        } else return null;
    }
}
