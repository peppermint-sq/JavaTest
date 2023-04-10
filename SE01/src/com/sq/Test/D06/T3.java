package com.sq.Test.D06;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
//在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，
// 在方法中从大到小依次打印三个变量。执行效果如下：
//请输入第一个整数：10
//请输入第二个整数：30
//请输入第三个整数：20
//从大到小的顺序是： 30 20 10
    method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = sc.nextInt();

        int index1 = num1>num2?num1:num2;
        int max = index1>num3?index1:num3;

        int index2 = num1>num2?num2:num1;
        int min = index2>num3?num3:num2;

        int med = num1+num2+num3-max-min;

        System.out.println("从大到小的顺序是："+max+" "+med+" "+min);
    }

}
