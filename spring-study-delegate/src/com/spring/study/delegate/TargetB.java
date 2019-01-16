package com.spring.study.delegate;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 10:25
 */
public class TargetB implements IExector {

    @Override
    public void doing() {
        System.out.println("员工B开始执行任务");
    }
}
