package com.spring.study.factory.abstr;

import com.spring.study.factory.Benz;
import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/3 11:54
 */
public class BenzFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
