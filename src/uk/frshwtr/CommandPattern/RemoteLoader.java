package uk.frshwtr.CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControlWithUndo.setCommand(0, livingRoomLight::on, livingRoomLightOff);
        remoteControlWithUndo.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControlWithUndo.setCommand(2, garageDoorOpenCommand, new NoCommand());
        remoteControlWithUndo.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);


        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWashPushed();
        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.offButtonWasPushed(0);
        System.out.println(remoteControlWithUndo);
        remoteControlWithUndo.undoButtonWashPushed();

    }
}
