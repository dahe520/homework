package com.vip.wh;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:39
 */
public class UnionPay implements IPay {
    public void pay(double price) {
        System.out.println("银联支付:"+price);
    }
}
