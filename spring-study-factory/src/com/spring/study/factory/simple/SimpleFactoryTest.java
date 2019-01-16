package com.spring.study.factory.simple;

import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/3 10:52
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        //这边就是我们的消费者
        SimpleFactory simpleFactory = new SimpleFactory();
        Car car = simpleFactory.getCar("BMW");
        System.out.println(car.getName());
    }
}
