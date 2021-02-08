package uk.frshwtr.StrategyPatterrn.Duck;

public class TurkeyAdapter extends Duck {
    Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void display() {
        turkey.display();
    }

    void quack() {
        turkey.gobble();
    }

    void fly() {
        turkey.fly();
        turkey.fly();
    }
}
