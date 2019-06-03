package com.clark.pattern.demo.command;

import com.clark.pattern.demo.command.command.Command;

/**
 * created by LuChang
 * 2019/6/3 15:28
 */
public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
