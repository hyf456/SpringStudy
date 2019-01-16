package com.spring.study.custom;

import java.lang.reflect.Method;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/2 14:31
 */
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;


}
