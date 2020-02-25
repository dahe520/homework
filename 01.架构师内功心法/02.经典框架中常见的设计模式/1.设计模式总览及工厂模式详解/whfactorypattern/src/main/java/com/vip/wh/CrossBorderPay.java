package com.vip.wh;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:41
 */
public class CrossBorderPay implements IPay{
    public void pay(double price) {
        System.out.println("跨境支付:"+price);
    }
}
