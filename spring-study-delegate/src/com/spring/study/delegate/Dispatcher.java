package com.spring.study.delegate;

/**
 * @Author: hanyf
 * @Description: 委派者：产品经理
 * @Date: 2019/1/7 10:27
 */
public class Dispatcher implements IExector {

    IExector exector;

    Dispatcher(IExector exector) {
        this.exector = exector;
    }

    /**
     * 功能描述 项目经理，虽然也有执行方法
     *     但是他的工作职责是不一样的
     * @author hanyf
     * @date 2019/1/7
     * @param
     * @return void
     */
    @Override
    public void doing() {
        this.exector.doing();
    }
}
