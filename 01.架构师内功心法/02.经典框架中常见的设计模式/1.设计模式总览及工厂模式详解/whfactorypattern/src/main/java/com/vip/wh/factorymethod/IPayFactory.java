package com.vip.wh.factorymethod;

import com.vip.wh.IPay;

/**
 * @Description  工厂模型
 * @auther wh
 * @date 2020/2/25 18:04
 */
public interface IPayFactory {

    IPay create();
}
