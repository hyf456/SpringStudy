package com.study.template;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 16:44
 */
public class Tea extends Bevegrage {

    //原材料放到杯中
    @Override
    public void pourInCup() {
        System.out.println("将茶叶放入杯中");
    }

    //放辅料
    @Override
    public void addCoundiments() {
        System.out.println("添加蜂蜜");
    }
}
