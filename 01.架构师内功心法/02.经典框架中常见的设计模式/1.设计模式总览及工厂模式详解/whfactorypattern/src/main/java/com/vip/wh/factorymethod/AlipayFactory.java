package com.vip.wh.factorymethod;

import com.vip.wh.AliPay;
import com.vip.wh.IPay;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 18:06
 */
public class AlipayFactory implements IPayFactory {

    public IPay create() {
        return new AliPay();
    }
}
