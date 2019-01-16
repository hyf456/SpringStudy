package com.spring.study.prototype.simple;

import java.util.ArrayList;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 13:38
 */
public class Prototype implements Cloneable {

    public ArrayList<String> list = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            prototype.list = (ArrayList)list.clone();

            //克隆基于字节码的
            //用发射，或者循环
        } catch (Exception e) {

        }
        return prototype;
    }
}
