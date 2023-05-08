package com.sq.Review;

public class P50 {
    public static void main(String[] args) {
// 逢七过
// 朋友聚会时可能会玩一个游戏：逢七过
// 游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
// 需求：使用程序在控制台打印出1-100之间的满足逢七过规则的数据
        for(int i = 1;i <= 100;i++){
            if((i%7==0)||(i%10==7)||(i>=70&i<=79)){
                System.out.println("过");
            }else {
                System.out.println(i+" ");
            }
        }
    }
}
