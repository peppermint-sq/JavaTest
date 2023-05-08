package com.sq.Review;

import java.util.Random;

public class P59 {
    public static void main(String[] args) {
//        遍历数组求和
//        需求：生成10个1~100之间的随机数存入数组
//        1）求出所有数据的和
//        2) 求出所有数据的平均数
//        3) 统计有多少个数据比平均值小
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
            sum = sum + arr[i];
            System.out.print(arr[i]+" ");
//            此处最好写多个循环，一个循环只干一件事
        }
        System.out.println("所有数据的和为："+sum);
        int ave = sum / arr.length;
        System.out.println("所有数据的平均数为："+ave);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ave){
                index++;
            }
        }
        System.out.println("有"+index+"个数据比平均值小");
    }
}
