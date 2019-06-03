package com.clark.pattern.demo.singleton;

/**
 * created by LuChang
 * 2019/6/3 11:20
 */
public class LockSingleton {

    private static volatile LockSingleton lockSingleton;


    private LockSingleton() {
    }


    public static LockSingleton getSingleton(){
        if (lockSingleton == null) {
            synchronized (LockSingleton.class) {
                if (lockSingleton == null){
                    lockSingleton = new LockSingleton();
                }
            }
        }
        return lockSingleton;
    }
}
