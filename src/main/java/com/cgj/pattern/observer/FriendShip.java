package com.cgj.pattern.observer;

import java.util.Date;

/**
 * @Classname FriendShip
 * @Description 朋友圈
 * @Date 2019/4/3 9:59
 * @Created by cgj
 */
public class FriendShip {

    private Date sendTiem;

    private String content;

    public Date getSendTiem() {
        return sendTiem;
    }

    public void setSendTiem(Date sendTiem) {
        this.sendTiem = sendTiem;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
