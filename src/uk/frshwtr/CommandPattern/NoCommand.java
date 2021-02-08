package uk.frshwtr.CommandPattern;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("No command");
    }

    @Override
    public void undo() {
        System.out.println("No command");
    }
}
