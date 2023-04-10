package com.sq.Test.anotherTest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
//完成算法：大整数的加法。
//int类型能表示的数是有极限的，超出极限的数如何进行加法运算?
// 请写一个控制台程序，对用户输入的2个整数（其中一个是大整数）进行加法运算。
        Scanner sc = new Scanner(System.in);

//        byte sum[] = new byte[200];
        int sum;
        System.out.println("请输入第一个整数：");
        String n1 = sc.next();
        System.out.println("请输入第二个整数：");
        String n2 = sc.next();
        int x = n1.length();
        int y = n2.length();

        for(int i = 0;i<=y;i++){

        char ch1 = n1.charAt(x-i);
        char ch2 = n2.charAt(y-i);
        sum = ch1 + ch2;
        System.out.println(sum);
        }
    }
}
