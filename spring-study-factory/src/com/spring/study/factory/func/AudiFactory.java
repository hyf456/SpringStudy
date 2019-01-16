package com.spring.study.factory.func;

import com.spring.study.factory.Audi;
import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/3 11:53
 */
public class AudiFactory implements Factory {

    @Override
    public Car getCar() {
        return new Audi();
    }
}
