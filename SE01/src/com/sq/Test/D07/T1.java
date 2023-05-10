package com.sq.Test.D07;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
//改进代码见com.sq.Review.P74_1
//机票价格按照淡季旺季、头等舱和经济舱收费,
// 输入机票原价、月份和头等舱或经济舱。
//按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
// 淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        ticket(6);
    }

    public static double ticket(int month){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double money = sc.nextInt();
        System.out.println("请输入舱位，1为头等舱，2为经济舱：");
        int seat = sc.nextInt();
        double ticket = 1;
        if(month>=5&month<=10){
            if(seat==1){
                ticket = money*0.9;
            } else if (seat == 2) {
                ticket = money*0.85;
            }else {
                System.out.println("舱位不合法！！");
            }
        }else if ((month>0&month<=4)|(month>=11&month<=12)){
            if(seat==1){
                ticket = money*0.7;
            } else if (seat == 2) {
                ticket = money*0.65;
            }else {
                System.out.println("舱位不合法！！");
            }
        }else {
            System.out.println("月份不合法！！");
        }
        System.out.println(ticket);
        return ticket;
    }
}
