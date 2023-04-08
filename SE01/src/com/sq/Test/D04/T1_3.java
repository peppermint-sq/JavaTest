package com.sq.Test.D04;

import java.util.Scanner;

public class T1_3 {

public static void main(String[] args) {
//某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，
// 到期凭存单支取本息。存款年利率表如下：
//存期		年利率（%）
//一年		2.25
//两年		2.7
//三年		3.25
//五年		3.6
//请存入一定金额（1000起存），存一定年限（四选一），
// 计算到期后得到的本息总额。
//提示：
//存入金额和存入年限均由键盘录入
//本息计算方式：本金+本金×年利率×年限

    Scanner sc = new Scanner(System.in);
    System.out.println("请输入存款金额（>=1000）:");
    int benjin = sc.nextInt();
    System.out.println("请输入存款年限（1、2、3、5）：");
    int year = sc.nextInt();
    double lilv = 0;
    if(year==1|year==2|year==3|year==5){
        if(year==1){
            lilv = 2.25;
        } else if (year== 2) {
            lilv = 2.7;
        } else if (year==3) {
            lilv = 3.25;
        } else{
            lilv = 3.6;
        }
    }else{
        System.out.println("存款年限不符合规定！！");
    }
    double total = benjin + benjin*lilv/100*year;
    System.out.println(total);
}

    public static void main1(String[] args) {
        // 2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 3.调用方法获取键盘录入的本金和存取年限
        System.out.println("请输入存款金额：");
        int money = sc.nextInt();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();
        // 4.定义本息和的变量
        double outMoney = 0;
        // 5.根据利率和年限计算本息和
        if (year == 1) {
            outMoney = money + money * 2.25 / 100 * 1;
        } else if (year == 2) {
            outMoney = money + money * 2.7 / 100 * 2;
        } else if (year == 3) {
            outMoney = money + money * 3.25 / 100 * 3;
        } else if (year == 5) {
            outMoney = money + money * 3.6 / 100 * 5;
        } else {
            System.out.println("输入的年限有误");
        }
        // 6.打印输出
        System.out.println("存款" + year + "年后的本息是：" + outMoney);
    }
}
