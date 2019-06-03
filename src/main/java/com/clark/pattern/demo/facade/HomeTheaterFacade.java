package com.clark.pattern.demo.facade;

/**
 * created by LuChang
 * 2019/6/3 16:54
 */
public class HomeTheaterFacade {

    private CdPlayer cdPlayer;
    /**
    * a lot of other stuff
    */

    public HomeTheaterFacade(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        /**
         * a lot of other stuff
         */
    }

    public void play(){
        cdPlayer.play();
        /**
         * a lot of other stuff
         */
        System.out.println("home theater play");
    }

}
