package com.cgj.pattern.prototype;

import java.io.Serializable;

/**
 * Created by Tom.
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }

    @Override
    public String toString() {
        return "JinGuBang{" +
                "h=" + h +
                ", d=" + d +
                '}';
    }
}
