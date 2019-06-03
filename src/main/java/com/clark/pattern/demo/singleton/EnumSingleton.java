package com.clark.pattern.demo.singleton;

/**
 * created by LuChang
 * 2019/6/3 11:12
 */
public class EnumSingleton {

    private EnumSingleton(){
    }

    public static EnumSingleton getSingleton(){
        return Singleton.SINGLETON.getEnumSingleton();
    }

    enum Singleton{
        SINGLETON;

        private EnumSingleton enumSingleton;

        Singleton() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getEnumSingleton() {
            return enumSingleton;
        }
    }
}
