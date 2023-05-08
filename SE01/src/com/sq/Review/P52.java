package com.sq.Review;

import java.util.Scanner;

public class P52 {
    public static void main(String[] args) {
// 求质数：
// 需求：键盘录入一个正整数x，判断该整数是否为一个质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
//        质数：除了1和他本身，没有其他数的乘积等于他的数
        for(int i = 2;i<num;i++){
            for(int j = num-1;j>=1;j--){
                if(i*j == num){
                    System.out.println(num+"不是质数");
//                    当出现两个不相等的数的乘积是该整数时，则表示这个整数不是质数，直接跳出循环
                    break;
                }
            }
//            System.out.println(num+"是质数");
//            怎么表示是质数？？？？？
        }
    }
}
