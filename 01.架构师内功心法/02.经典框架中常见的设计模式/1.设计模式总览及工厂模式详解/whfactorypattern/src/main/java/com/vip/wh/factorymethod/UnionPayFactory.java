package com.vip.wh.factorymethod;

import com.vip.wh.IPay;
import com.vip.wh.UnionPay;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 18:29
 */
public class UnionPayFactory implements IPayFactory{
    public IPay create() {
        return new UnionPay();
    }
}
