package com.spring.study.factory.func;

import com.spring.study.factory.Car;

/**
 * @Author: hanyf
 * @Description: 工厂接口，就定义了所有工厂的执行标准
 * @Date: 2019/1/3 11:50
 */
public interface Factory {

    //符合汽车上路标准
    //尾气排放标准
    //电子设备安全系数
    //必须配备安全带、安全气囊
    //轮带的耐磨程度
    Car getCar();
}
