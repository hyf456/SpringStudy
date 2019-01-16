package com.spring.study.proxy.cglib;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/2 17:39
 */
public class TestCglibProxy {
    public static void main(String[] args) {

        //TP4
        //FF.FF.FF.FF
        //255.255.255.255
        //0.0.0.0

        //IP6
        //FFFF.FFFF.FFFF.FFFF.FFFF.FFFF
        //0.0.0.0.0.0

        //AOP 解耦（团队开发）
        //变相：三层架构（解耦）
        //如果整个项目都是一个人全部做完
        //Tom接了个私活，现在客户说，让我1个月就完成

        //JDK的动态代理是通过接口来进行强制转换的
        //生成以后的代理对象，可以强制转换为接口

        //CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
        //生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
        //子类引用赋值给父类

        try {
            // YunZhongyu obj = (YunZhongyu) new GPMeipo().getInstance("com.spring.study.proxy.cglib.YunZhongyu");
            // YunZhongyu obj = (YunZhongyu) new GPMeipo().getInstance(new YunZhongyu());
            YunZhongyu obj = (YunZhongyu) new GPMeipo().getInstance(YunZhongyu.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
