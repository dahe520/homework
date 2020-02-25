package com.vip.wh;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:36
 */
public class WeChat implements IPay {
    public void pay(double price) {
        System.out.println("微信支付:"+price);
    }
}
