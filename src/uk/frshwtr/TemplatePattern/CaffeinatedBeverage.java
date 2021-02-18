package uk.frshwtr.TemplatePattern;

public abstract class CaffeinatedBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water..");
    };

    void pourInCup() {
        System.out.println("Pouring in to cup...");
    };
}
