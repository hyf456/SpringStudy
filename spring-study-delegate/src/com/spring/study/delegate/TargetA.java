package com.spring.study.delegate;

/**
 * @Author: hanyf
 * @Description: 想法，用代码来描述这种想法？
 * 所以，写的比较简单
 * @Date: 2019/1/7 10:24
 */
public class TargetA implements IExector {

    @Override
    public void doing() {
        System.out.println("员工A开始执行任务");
    }
}
