package com.sq.Test.D04;

import java.util.Scanner;

public class T1_2 {
    public static void main1(String[] args) {
// 让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = a<b&a<c?a:(b<a&b<c?b:c);
        System.out.println(min);
//        if(a<b & a<c){
//            System.out.println(a);
//        }else
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b & a<c){
            System.out.println(a);
       }else {
            if(b<a & b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
