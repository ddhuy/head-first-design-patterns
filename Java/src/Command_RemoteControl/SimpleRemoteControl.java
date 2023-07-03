package Command_RemoteControl;

import Command_RemoteControl.command.Command;
import Command_RemoteControl.command.NoCommand;

public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommands = new NoCommand();
        for (int i = 0; i < 7; ++i) {
            onCommands[i] = offCommands[i] = noCommands;
        }

        undoCommand = noCommands;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void pressUndoButton() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; ++i) {
            stringBuilder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName())
                    .append("      ").append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand.getClass().getName());
        stringBuilder.append("\n------------\n");

        return stringBuilder.toString();
    }
}
