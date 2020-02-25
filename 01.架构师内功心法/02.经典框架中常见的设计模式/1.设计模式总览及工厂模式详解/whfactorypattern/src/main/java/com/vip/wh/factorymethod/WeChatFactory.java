package com.vip.wh.factorymethod;

import com.vip.wh.IPay;
import com.vip.wh.WeChat;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 18:28
 */
public class WeChatFactory implements IPayFactory{
    public IPay create() {
        return new WeChat();
    }
}
