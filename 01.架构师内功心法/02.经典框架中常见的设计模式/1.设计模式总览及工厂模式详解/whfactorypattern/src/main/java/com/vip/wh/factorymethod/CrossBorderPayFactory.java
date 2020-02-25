package com.vip.wh.factorymethod;

import com.vip.wh.CrossBorderPay;
import com.vip.wh.IPay;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 19:49
 */
public class CrossBorderPayFactory implements IPayFactory {
    public IPay create() {
        return new CrossBorderPay();
    }
}
