package com.spring.study.prototype.greatestsage;

import java.io.*;
import java.util.Date;

/**
 * @Author: hanyf
 * @Description: 齐天大圣
 * @Date: 2019/1/7 14:53
 */
public class TheGreatestSage extends Monkey implements Cloneable, Serializable {

    //金箍棒
    private GoldRingedStaff staff;

    //从石头缝里蹦出来
    TheGreatestSage() {
        this.staff = new GoldRingedStaff();
        this.birthday = new Date();
        this.height = 150;
        this.weight = 30;
        System.out.println("----------");
    }

    /**
     * 功能描述 分身技能
     * @author hanyf
     * @date 2019/1/7 15:04
     * @param []
     * @return java.lang.Object
     */
    @Override
    public Object clone() {
        //克隆不走构造方法，直接字节流复制
        //深度克隆
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //return super.clone();默认浅克隆，只克隆八大基本类型和String
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            TheGreatestSage copy = (TheGreatestSage) ois.readObject();
            copy.birthday = new Date();

            return copy;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Object clone = null;
        // try {
        //     clone = super.clone();
        // } catch (CloneNotSupportedException e) {
        //     e.printStackTrace();
        // }
        // return clone;
    }

    /**
     * 功能描述 变化
     * @author hanyf
     * @date 2019/1/7 15:05
     * @param []
     * @return void
     */
    public void change() {
        TheGreatestSage copySage = (TheGreatestSage) clone();
        System.out.println("大圣本尊生日是：" + this.getBirthday().getTime());
        System.out.println("克隆大圣生日是：" + copySage.getBirthday().getTime());
        System.out.println("大圣本尊和克隆大圣是否为同一个对象：" + (this == copySage));
        System.out.println("大圣的本尊持有的金箍棒跟克隆大圣持有的金箍棒是否为同一个对象：" + (this.getStaff() == copySage.getStaff()));
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }
}
