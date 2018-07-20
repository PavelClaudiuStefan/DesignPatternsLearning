package designpatterns.chapter6;

import designpatterns.chapter6.commands.*;
import designpatterns.chapter6.devices.*;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(8);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main House");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command[] someSortOfPartyOn = {livingRoomLightOn, stereoOnWithCD, ceilingFanHigh};
        Command[] someSortOfPartyOff = {livingRoomLightOff, stereoOff, ceilingFanOff};
        MacroCommand partyOnMacro = new MacroCommand(someSortOfPartyOn);
        MacroCommand partyOffMacro = new MacroCommand(someSortOfPartyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(6, ceilingFanLow, ceilingFanOff);
        remoteControl.setCommand(7, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        // Living Room Light
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        // Kitchen Light
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        // Main House Garage Door
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        // Living Room Stereo
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        // Living Room Ceiling Fan
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(6);
        remoteControl.offButtonWasPushed(6);

        System.out.println("\n----- Party -----");
        remoteControl.onButtonWasPushed(7);
        remoteControl.offButtonWasPushed(7);
        remoteControl.undoButtonWasPushed();
    }

}
