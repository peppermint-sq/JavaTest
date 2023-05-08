package com.sq.Review;

import java.util.Scanner;

public class P51_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if(i*i == num){
                System.out.println(i+"就是"+num+"的平方根");
            }else if(i*i > num){
                System.out.println((i-1)+"就是"+num+"平方根的整数部分");
                break;
//                当平方根不是整数时，当自增到正好大于平方根的数时输出，然后跳出循环
            }
        }
    }
}
