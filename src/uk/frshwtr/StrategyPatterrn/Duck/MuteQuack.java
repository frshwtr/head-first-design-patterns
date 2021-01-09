package uk.frshwtr.StrategyPatterrn.Duck;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("Nothing...");
    }
}