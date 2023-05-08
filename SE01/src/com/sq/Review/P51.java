package com.sq.Review;

import java.util.Scanner;

public class P51 {
    public static void main(String[] args) {
// 求平方根
// 需求：键盘录入一个大于等于2的整数x,计算并返回x的平方根，结果只保留整数部分，小数部分将被舍去。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if((i*i<=num)&((i+1)*(i+1)>=num)){
                System.out.println(num+"的平方根是："+i);
            }
        }
    }
}
