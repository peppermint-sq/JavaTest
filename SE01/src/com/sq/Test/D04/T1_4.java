package com.sq.Test.D04;

import java.util.Scanner;

public class T1_4 {
    public static void main(String[] args) {
//某商场购物可以打折，具体规则如下：
//普通顾客购不满100元不打折，满100元打9折；
//会员购物不满200元打8折，满200元打7.5折；
//不同打折规则不累加计算。
//请根据此优惠计划进行购物结算，
// 键盘录入顾客的类别（0表示普通顾客，1表示会员）
// 和购物的折前金额（整数即可），输出应付金额（小数类型）。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类型：");
        int god = sc.nextInt();
        System.out.println("请输入商品金额：");
        double money = sc.nextDouble();
        double endmoney = 0;
        if(god == 0){
            if(money >= 100){
                endmoney = money*0.9;
            } else if (money>0 & money < 100) {
                endmoney = money;
            }else {
                System.out.println("您输入的金额有误！！");
            }
            System.out.println("您的折后金额为："+ endmoney);
        } else if (god == 1) {

            if(money>0 & money < 200){
                endmoney = money*0.8;
                System.out.println("您的折后金额为："+ endmoney);
            }else if ( money >= 200){
                endmoney = money*0.75;
                System.out.println("您的折后金额为："+ endmoney);
            }else{
                System.out.println("您输入的金额有误！！");
            }
        }else {
            System.out.println("顾客类别输入不符！！");
        }
    }
}
