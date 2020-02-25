package com.vip.wh.factorymethod;

import com.vip.wh.IPay;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 19:53
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IPayFactory factory = new AlipayFactory();
        IPay pay = factory.create();
        pay.pay(600);

        factory = new WeChatFactory();
        pay = factory.create();
        pay.pay(650);

        factory = new UnionPayFactory();
        pay = factory.create();
        pay.pay(700);

        factory = new CrossBorderPayFactory();
        pay = factory.create();
        pay.pay(750);

    }
}
