package com.sq.Review;

import java.util.Scanner;

public class P74 {
    public static void main(String[] args) {
//        卖飞机票
//        需求：机票价格按照淡季旺季、头等舱和经济舱收费，输入机票原价、月份和头等舱或经济舱。
//        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

//        1.键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位，0是头等舱，1是经济舱：");
        int seat = sc.nextInt();
//        2.判断当前月份是旺季还是淡季
        if(month >= 5 && month <= 10){
//            旺季//        3.继续判断当前机票是经济舱还是头等舱
            if(seat == 0){
//                头等舱
                ticket = (int)(ticket * 0.9);//把结果进行强转
            } else if (seat == 1) {
//                经济舱
                ticket = (int)(ticket * 0.85);
            }else {
                System.out.println("没有这个舱位");
            }
        } else if ((month >= 1 && month <= 4)||(month >= 11 && month <=12)) {
//            淡季
            if(seat == 0){
//                头等舱
                ticket = (int)(ticket * 0.7);
            } else if (seat == 1) {
//                经济舱
                ticket = (int)(ticket * 0.65);
            }else {
                System.out.println("没有这个舱位");
            }
        }else {
            System.out.println("键盘录入的月份不合法！！");
        }

//        4.计算出机票价格
        System.out.println(ticket);
    }
}
