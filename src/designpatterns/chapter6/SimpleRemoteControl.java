package designpatterns.chapter6;

import designpatterns.chapter6.commands.Command;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
