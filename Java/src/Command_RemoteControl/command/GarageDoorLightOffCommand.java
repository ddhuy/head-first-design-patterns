package Command_RemoteControl.command;

import Command_RemoteControl.vendor.GarageDoor;

public class GarageDoorLightOffCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
    }

    @Override
    public void undo() {
        garageDoor.lightOn();
    }
}
