package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanSpeedCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public String toString() {
        return "CeilingFanMediumCommand";
    }
}
