package uk.frshwtr.CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Basic light");
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);

        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);

        remote.buttonWasPressed();
    }
}
