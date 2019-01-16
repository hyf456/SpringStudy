package com.spring.study.factory.abstr;

import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/3 13:58
 */
public class DefaultFactory extends AbstractFactory {

    private AudiFactory defaultFactory = new AudiFactory();

    @Override
    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
