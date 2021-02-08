package uk.frshwtr.StrategyPatterrn.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        Turkey christmasTurkey = new ChristmasTurkey();
        Duck fakeDuck = new TurkeyAdapter(christmasTurkey);

        fakeDuck.setFlyBehaviour(() -> System.out.println("Gobble gobble!"));
        fakeDuck.setQuackBehaviour(() ->  System.out.println("QuackGobble"));
        fakeDuck.performFly();
        fakeDuck.performQuack();

    }
}