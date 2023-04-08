package com.sq.Test.D03;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
//需求：
//数字6是一个真正伟大的数字，键盘录入两个整数。
//如果其中一个为6，最终结果输出true。
//如果它们的和为6的倍数。最终结果输出true。
//其他情况都是false。
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c = a==6|b==6|(a+b)/6==0 ? true : false;
        System.out.println(c);
    }
}
