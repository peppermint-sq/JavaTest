package com.sq.Review;

public class P58 {
    public static void main(String[] args) {
//        求最值：
//        需求：已知数组元素为{33,5,22,44,55}，请找出数组中最大值并打印在控制台
        int[] arr = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大值为："+max);
    }
}
