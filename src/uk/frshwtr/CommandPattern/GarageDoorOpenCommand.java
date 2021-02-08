package uk.frshwtr.CommandPattern;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
garageDoor.down();
    }
}
