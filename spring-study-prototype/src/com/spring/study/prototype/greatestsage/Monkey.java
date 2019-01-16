package com.spring.study.prototype.greatestsage;

import java.util.Date;

/**
 * @Author: hanyf
 * @Description: 猴子
 * @Date: 2019/1/7 14:53
 */
public class Monkey {

    //身高
    protected int height;
    //体重
    protected int weight;
    //生日
    protected Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
