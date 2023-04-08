package com.sq.Test.D04;

import java.util.Scanner;

public class T3_5 {
    public static void main(String[] args) {
//定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围。
//将两数相除，要求不使用乘法、除法和 % 运算符。
//得到商和余数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();
        int shang = 0;
        while(dividend>=divisor){
            dividend = dividend - divisor;
            shang ++;
        }
        System.out.println("商为："+ shang);
        System.out.println("余数为："+ dividend);
    }
}
