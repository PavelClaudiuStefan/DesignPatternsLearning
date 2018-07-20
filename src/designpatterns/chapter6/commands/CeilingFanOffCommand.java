package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanSpeedCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public String toString() {
        return "CeilingFanOffCommand";
    }
}
