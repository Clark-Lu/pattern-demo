package com.clark.pattern.demo.command.command;

import com.clark.pattern.demo.command.things.GarageDoor;

/**
 * created by LuChang
 * 2019/6/3 15:37
 */
public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
