package com.sq.Review;

import java.util.Scanner;

public class P52_1 {
    public static void main(String[] args) {
//        质数：如果一个整数只能被1和他本身整除，那么这个数就是质数，否则就是合数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
//        定义一个变量表示标记
//        标记着num是否为一个质数
//        true:是一个质数 false：不是一个质数
        boolean flag = true;//表示最初就认为num是一个质数

        for(int i = 2;i<num;i++){
            if(num % i == 0){
                flag = false;//将标记改为false，表示此时num已经不是质数了
//                System.out.println(num+"不是一个质数");
                break;
            }
        }
        //只有当这个循环结束了，表示这个循环之内所有数字都判断完毕了，此时才能断定num是一个质数
        //标记思想
        if(flag){
            System.out.println(num+"是一个质数");
        }else {
            System.out.println(num+"不是一个质数");
        }

//        简化思路：
//        以81的平方根9，为中心
//        而且假设a*b=81
//        那么a和b中，其中一个一定是小于等于平方根
//        另外一个一定是大于等于平方根

        //循环可以从2循环到num的平方根
//        for(int i = 2;i<=num的平方根；i++){
//        }
    }
}
