package com.study.template;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 16:42
 */
public class Coffee extends Bevegrage {

    //原材料放到杯中
    @Override
    public void pourInCup() {
        System.out.println("将咖啡倒入杯中");
    }

    //放辅料
    @Override
    public void addCoundiments() {
        System.out.println("添加牛奶和糖");
    }
}
