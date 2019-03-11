package com.cgj.pattern.prototype;


import java.io.*;
import java.util.Date;

/**
 * Created by Tom.
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    public Object clone(){
        return deepClone();

    }

    private Object deepClone() {


        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;


        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream =  new ObjectInputStream(byteArrayInputStream);

            return objectInputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (byteArrayInputStream != null){
                try {
                    byteArrayInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }


}
