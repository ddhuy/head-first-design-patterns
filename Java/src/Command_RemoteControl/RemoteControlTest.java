package Command_RemoteControl;

import Command_RemoteControl.command.*;
import Command_RemoteControl.vendor.CeilingFan;
import Command_RemoteControl.vendor.GarageDoor;
import Command_RemoteControl.vendor.Light;
import Command_RemoteControl.vendor.Stereo;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        // Create all commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
        Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

        Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        // setup macro command
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, ceilingFanOn};
        Command[] partyOff = {livingRoomLightOff, stereoOffWithCD, ceilingFanOff};
        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        // set up remote control
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOffWithCD);
        remote.setCommand(4, partyOnMacro, partyOffMacro);

        // step through each slot and push its On and Off buttons
        remote.pressOnButton(0);
        remote.pressOffButton(0);
        System.out.println(remote);
        remote.pressUndoButton();

        remote.pressOnButton(1);
        remote.pressOffButton(1);
        System.out.println(remote);
        remote.pressUndoButton();

//        remote.pressOnButton(2);
//        remote.pressOffButton(2);
//        remote.pressOnButton(3);
//        remote.pressOffButton(3);
    }
}
