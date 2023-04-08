package com.sq.Test.D03;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
//        键盘录入一个三位数，求这个三位数每一位的数字和。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int a = sc.nextInt();
        int b = a/100 + a%100/10 +a%100%10;
        System.out.println(b);
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;

        int sum = ge + shi + bai;
        System.out.println(sum);
    }
}
