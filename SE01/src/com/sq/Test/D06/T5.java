package com.sq.Test.D06;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
//键盘录入一个正整数
//定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
//在main方法中打印该数字是几位数
//演示格式如下:
//(1)演示一:
//	请输入一个整数:1234
//	控制台输出:1234是4位数字
//(2)演示二:
//	请输入一个整数:34567
//	控制台输出:34567是5位数字
        System.out.println(getDig());
    }
    public static int getDig(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int dig = 0;
        while(num > 0){
            num = num/10;
            dig++;
        }
        return dig;
    }
}
