package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.CeilingFan;

public abstract class CeilingFanSpeedCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public abstract void execute();

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
