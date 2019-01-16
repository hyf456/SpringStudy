package com.spring.study.delegate;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 10:29
 */
public class DispatcherTest {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new TargetA());
        //看上去好像我们项目经理在干活
        //但实际干活的人是普通员工
        //这就是典型，干活是我的，功劳是你的
        dispatcher.doing();
    }
}
