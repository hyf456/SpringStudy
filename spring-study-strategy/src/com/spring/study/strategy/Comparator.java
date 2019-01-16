package com.spring.study.strategy;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 11:50
 */
@FunctionalInterface
public interface Comparator {

    int compareTo(Object obj1,Object obj2);

    @Override
    boolean equals(Object obj);

}
