package uk.frshwtr.StatePattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs :(");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No gumballs :(");
    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs :(");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs :(");
    }
}
