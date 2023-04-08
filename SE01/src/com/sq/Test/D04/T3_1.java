package com.sq.Test.D04;

import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {
//键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();
        int sum = 0;
        if(number1 < number2){
            for(int i = number1;i <= number2;i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }else{
            for(int i = number2;i <= number1;i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
