package com.cgj.pattern.observer;

import java.util.Date;

/**
 * @Classname ObserverTest
 * @Description 观察者demo
 * @Date 2019/4/3 10:16
 * @Created by cgj
 */
public class ObserverTest {
    public static void main(String[] args) {
        FriendShip friendShip = new FriendShip();
        friendShip.setContent("今天很开心");
        friendShip.setSendTiem( new Date());
        FriendA friendA = new FriendA("朋友A");

        friendA.addObserver(new Me());
        friendA.pubFriendShip(friendShip);
    }
}
