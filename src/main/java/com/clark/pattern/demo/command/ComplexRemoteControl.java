package com.clark.pattern.demo.command;

import com.clark.pattern.demo.command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * created by LuChang
 * 2019/6/3 15:42
 */
public class ComplexRemoteControl {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void buttonWasPressed(){
        for (Command command : commandList){
            command.execute();
        }
    }

}
