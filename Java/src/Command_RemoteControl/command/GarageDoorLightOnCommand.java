package Command_RemoteControl.command;

import Command_RemoteControl.vendor.GarageDoor;

public class GarageDoorLightOnCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
