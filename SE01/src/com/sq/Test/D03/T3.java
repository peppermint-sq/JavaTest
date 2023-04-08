package com.sq.Test.D03;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class T3 {
    public static void main(String[] args) {
//        某小伙想定一份外卖，商家的优惠方式如下：
//        鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
//        订单满30元8折优惠。
//        鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
//        那么这个小伙要点这三样东西，最少要花多少钱？
        int yuxiangrousi = 24;
        int huashengmi = 8;
        int rice = 3;
        int youhuirousi = 16;
        double dazhe = (yuxiangrousi + huashengmi + rice)*0.8;
        double youhui = youhuirousi + huashengmi + rice;
        double money = dazhe > youhui ? youhui:dazhe;
        System.out.println(money);
    }
}
