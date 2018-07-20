package designpatterns.chapter6;

import designpatterns.chapter6.commands.LightOnCommand;
import designpatterns.chapter6.devices.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }

}
