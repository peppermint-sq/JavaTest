package com.sq.Review;

import java.util.Random;
import java.util.Scanner;

public class P53 {
    public static void main(String[] args) {
// 猜数字小游戏：
// 需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少

        Random r = new Random();
        int num = r.nextInt(101);//随机数范围，从0开始，包头不包尾
//        生成随机数的代码不能写在循环里边
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜的数字：");
            int num1 = sc.nextInt();
            if(num == num1){
                System.out.println("恭喜你，猜对了！");
                break;
            }else{
//                System.out.println("猜错了");
//                System.out.println(num);
                if(num1>num){
                    System.out.println("猜大了");
                }else {
                    System.out.println("猜小了");
                }
            }
        }
    }
}
