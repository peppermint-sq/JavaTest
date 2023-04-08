package com.sq.Test.D04;


import java.util.Scanner;

public class T3_4 {

    public static void main(String[] args) {
//需求：给你一个整数 x 。
//如果 x 是一个回文整数，打印 true ，否则，返回 false 。
//解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//例如，121 是回文，而 123 不是
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while(x!=0){
            int ge = x %10;
            x = x/10;
            num = num*10 + ge;
        }
        System.out.println(num);
//        System.out.println(x);
        System.out.println(num == temp);
    }
}
