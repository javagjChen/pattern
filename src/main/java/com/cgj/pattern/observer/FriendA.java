package com.cgj.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Classname FriendA
 * @Description 模拟朋友A发了一条朋友圈
 * @Date 2019/4/3 10:01
 * @Created by cgj
 */
public class FriendA extends Observable {

    private String name;

    public FriendA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pubFriendShip(FriendShip friendShip){
        System.out.println(this.name + "发了一条朋友圈");
        setChanged();
        notifyObservers(friendShip);
    }
}
