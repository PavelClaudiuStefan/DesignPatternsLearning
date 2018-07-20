package designpatterns.chapter6;

import designpatterns.chapter6.commands.Command;
import designpatterns.chapter6.commands.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int groupsOfButtonsNumber) {
        onCommands = new Command[groupsOfButtonsNumber];
        offCommands = new Command[groupsOfButtonsNumber];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
        undoCommand = new NoCommand();
    }

    private String nrOfSpacesNeeded(int maxLength, int currentLength) {
        return new String(new char[maxLength - currentLength + 4]).replace("\0", " ");
    }

    @Override
    public String toString() {
        int maxLenght = 0;
        for (Command onCommand : onCommands) {
            int currentLength = onCommand.toString().length();
            if (currentLength > maxLenght)
                maxLenght = currentLength;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n ------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            int currentLength = onCommands[i].toString().length();
            stringBuilder.append("[slot ")
                         .append(i)
                         .append("] ")
                         .append(onCommands[i])
                         .append(nrOfSpacesNeeded(maxLenght, currentLength))
                         .append(offCommands[i])
                         .append("\n");
        }
        stringBuilder.append("[undo] ").append(undoCommand).append("\n ------ Remote Control ------\n");
        return stringBuilder.toString();
    }
}
