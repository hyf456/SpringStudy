package com.spring.study.factory.func;

import com.spring.study.factory.Bmw;
import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/3 11:54
 */
public class BmwFactory implements Factory {

    @Override
    public Car getCar() {
        return new Bmw();
    }
}
