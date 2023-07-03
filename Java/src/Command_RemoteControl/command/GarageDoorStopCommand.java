package Command_RemoteControl.command;

import Command_RemoteControl.vendor.GarageDoor;

public class GarageDoorStopCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.resume();
    }
}
