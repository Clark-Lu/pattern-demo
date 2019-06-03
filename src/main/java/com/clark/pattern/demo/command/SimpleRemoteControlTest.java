package com.clark.pattern.demo.command;

import com.clark.pattern.demo.command.command.GarageDoorOpenCommand;
import com.clark.pattern.demo.command.command.LightOnCommand;
import com.clark.pattern.demo.command.things.GarageDoor;
import com.clark.pattern.demo.command.things.Light;

/**
 * created by LuChang
 * 2019/6/3 15:34
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
