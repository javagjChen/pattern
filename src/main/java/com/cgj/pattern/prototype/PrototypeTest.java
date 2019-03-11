package com.cgj.pattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

        System.out.println(qiTianDaSheng.jinGuBang);
        System.out.println(clone.jinGuBang);

        System.out.println(qiTianDaSheng.birthday);
        System.out.println(clone.birthday);
        System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
    }
}
