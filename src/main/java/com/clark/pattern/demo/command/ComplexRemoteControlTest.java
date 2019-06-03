package com.clark.pattern.demo.command;

import com.clark.pattern.demo.command.command.GarageDoorOpenCommand;
import com.clark.pattern.demo.command.command.LightOnCommand;
import com.clark.pattern.demo.command.things.GarageDoor;
import com.clark.pattern.demo.command.things.Light;

/**
 * created by LuChang
 * 2019/6/3 15:50
 */
public class ComplexRemoteControlTest {
    public static void main(String[] args) {
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        ComplexRemoteControl complexRemoteControl = new ComplexRemoteControl();
        complexRemoteControl.addCommand(garageDoorOpenCommand);
        complexRemoteControl.addCommand(lightOnCommand);
        complexRemoteControl.buttonWasPressed();
    }
}
