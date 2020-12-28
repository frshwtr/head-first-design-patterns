package uk.frshwtr.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehaviour(new Quack());
        setFlyBehaviour(new FlyWithWings());
    }

    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}