package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String toString() {
        return "LightOffCommand";
    }
}
