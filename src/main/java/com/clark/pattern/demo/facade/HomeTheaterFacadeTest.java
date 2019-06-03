package com.clark.pattern.demo.facade;

/**
 * created by LuChang
 * 2019/6/3 16:57
 */
public class HomeTheaterFacadeTest {

    public static void main(String[] args) {
        CdPlayer cdPlayer = new CdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(cdPlayer);
        homeTheaterFacade.play();
    }

}
