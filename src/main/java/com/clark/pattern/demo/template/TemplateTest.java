package com.clark.pattern.demo.template;

/**
 * created by LuChang
 * 2019/6/3 17:24
 */
public class TemplateTest {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();
        Coffee coffee = new Coffee();
        coffee.prepare();
    }
}
