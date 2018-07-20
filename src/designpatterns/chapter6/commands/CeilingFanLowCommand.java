package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanSpeedCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public String toString() {
        return "CeilingFanLowCommand";
    }
}
