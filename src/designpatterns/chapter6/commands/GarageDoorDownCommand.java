package designpatterns.chapter6.commands;

import designpatterns.chapter6.devices.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

    @Override
    public String toString() {
        return "GarageDoorDownCommand";
    }
}
