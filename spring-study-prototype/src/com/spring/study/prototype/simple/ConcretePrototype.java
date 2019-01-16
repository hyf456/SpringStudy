package com.spring.study.prototype.simple;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 13:41
 */
public class ConcretePrototype extends Prototype {

    private int age;

    private String name;

    //几百个字段

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
