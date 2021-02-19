package uk.frshwtr.StatePattern;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(int initialGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = initialGumballs;
        if (initialGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    int getCount() {
        return count;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out of the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    State getSoldState() {
        return soldState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }
}
