package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanSpeedCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public String toString() {
        return "CeilingFanHighCommand";
    }
}
