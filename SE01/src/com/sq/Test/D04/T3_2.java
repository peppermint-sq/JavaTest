package com.sq.Test.D04;

import java.util.Scanner;

public class T3_2 {
    public static void main(String[] args) {
//需求：键盘录入两个数字，表示一个范围。
//统计这个范围中。
//既能被3整除，又能被5整除数字有多少个？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();
        int min = number1>number2 ? number2 : number1;
        int max = number1<number2 ? number2 : number1;

        int number = 0;
        int a = 0;
        for(int i = min;i <= max;i++){
            number = i++;//此处number可直接省略，因为number即为i
            if((number%3==0)&(number%5==0)){
                a=a+1;
            }
        }
        System.out.println(a);
    }
}
