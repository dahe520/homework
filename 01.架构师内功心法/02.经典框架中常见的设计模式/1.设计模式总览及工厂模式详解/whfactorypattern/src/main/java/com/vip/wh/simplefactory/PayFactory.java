package com.vip.wh.simplefactory;

import com.vip.wh.IPay;

/**
 * @Description
 * @auther wh
 * @date 2020/2/25 17:45
 */
public class PayFactory {

    public IPay create(Class<? extends IPay> clazz){
        try {
            if (null != clazz){
                return clazz.newInstance();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
