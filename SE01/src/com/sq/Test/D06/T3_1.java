package com.sq.Test.D06;

import java.util.Scanner;

public class T3_1 {
//在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，
// 在方法中从大到小依次打印三个变量。执行效果如下：
//请输入第一个整数：10
//请输入第二个整数：30
//请输入第三个整数：20
//从大到小的顺序是： 30 20 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int num3 = sc.nextInt();

        //获取最大值
        int max = getMax(num1, num2, num3);
        //获取最小值
        int min = getMin(num1, num2, num3);
        //获取中间值
        int mid = (num1 + num2 + num3) - max - min;

        System.out.println(max + " " + mid + " " + min);
    }
    public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    public static int getMin(int a, int b, int c) {
        int temp = a < b ? a : b;
        int min = temp < c ? temp : c;
        return min;
    }
}
