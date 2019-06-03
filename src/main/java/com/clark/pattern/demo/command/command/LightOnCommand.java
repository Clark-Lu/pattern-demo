package com.clark.pattern.demo.command.command;

import com.clark.pattern.demo.command.things.Light;

/**
 * created by LuChang
 * 2019/6/3 15:26
 */
public class LightOnCommand implements Command {

    public LightOnCommand(Light light) {
        this.light = light;
    }

    private Light light;

    @Override
    public void execute() {
        light.on();
    }
}
