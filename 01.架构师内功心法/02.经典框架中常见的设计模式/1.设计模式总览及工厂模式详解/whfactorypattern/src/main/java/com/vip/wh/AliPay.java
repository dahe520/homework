package com.vip.wh;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:33
 */
public class AliPay implements IPay {
    public void pay(double price) {
        System.out.println("支付宝支付:" + price);
    }
}
