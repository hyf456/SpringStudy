package com.spring.study.factory.abstr;

import com.spring.study.factory.Audi;
import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description: 具体的业务逻辑封装
 * @Date: 2019/1/3 11:53
 */
public class AudiFactory extends AbstractFactory {

    @Override
    public Car getCar() {
        return new Audi();
    }
}
