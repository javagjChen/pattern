package com.cgj.pattern.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * @Classname Me
 * @Description 我作为观察者，会自动发现朋友A的朋友圈状态
 * @Date 2019/4/3 10:03
 * @Created by cgj
 */
public class Me implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        FriendA friendA = (FriendA) o;
        FriendShip  friendShip = (FriendShip) arg;
        System.out.println(friendA.getName() + "在 " + friendShip.getSendTiem() + "发了一条内容为："
            + friendShip.getContent() + "的朋友圈");
    }
}
