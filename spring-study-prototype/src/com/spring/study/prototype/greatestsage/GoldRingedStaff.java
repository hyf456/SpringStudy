package com.spring.study.prototype.greatestsage;

import java.io.Serializable;

/**
 * @Author: hanyf
 * @Description: 金箍棒
 * @Date: 2019/1/7 14:53
 */
public class GoldRingedStaff implements Serializable {

    //长度
    private float height = 100;
    //直径
    private float diameter = 10;

    /**
     * 功能描述 金箍棒变大
     * @author hanyf
     * @date 2019/1/7 14:58
     * @param []
     * @return void
     */
    public void grow() {
        this.diameter *= 2;
        this.height *= 2;
    }

    /**
     * 功能描述 金箍棒缩小
     * @author hanyf
     * @date 2019/1/7 14:59
     * @param []
     * @return void
     */
    public void shrink() {
        this.diameter /= 2;
        this.height /= 2;
    }
}
