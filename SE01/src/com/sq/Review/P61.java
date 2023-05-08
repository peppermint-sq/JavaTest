package com.sq.Review;

import java.util.Random;

public class P61 {
    public static void main(String[] args) {
//        打乱数组中的数据：
//        需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(4)+1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
