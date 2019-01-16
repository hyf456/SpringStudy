package com.spring.study.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: hanyf
 * @Description:
 * @Date: 2019/1/7 11:45
 */
public class MyListTest {

    public static void main(String[] args) {

        // new MyList.sort(new NumberComparator());


        //策略模式
        List<Long> number = new ArrayList<>();

        Collections.sort(number, new Comparator<Long>() {

            //返回值是固定的0，-1，1
            @Override
            public int compare(Long o1, Long o2) {
                return 0;
            }
        });

    }
}
