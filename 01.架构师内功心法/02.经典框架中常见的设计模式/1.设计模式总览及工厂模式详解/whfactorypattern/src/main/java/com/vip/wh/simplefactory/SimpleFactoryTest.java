package com.vip.wh.simplefactory;

import com.vip.wh.*;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:51
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        PayFactory factory = new PayFactory();
        //选择支付方式
        //IPay pay = factory.create(AliPay.class);
        //IPay pay = factory.create(WeChat.class);
        //IPay pay = factory.create(UnionPay.class);
        IPay pay = factory.create(CrossBorderPay.class);
        pay.pay(500);
    }
}
