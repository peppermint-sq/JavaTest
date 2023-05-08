package com.sq.Review;

public class P60_1 {
    public static void main(String[] args) {
//        交换数组中的数据：
//        需求：定义一个数组，存入1,2,3,4,5.按照要求交换索引对应的元素。
//        交换前:1,2,3,4,5
//        交换后:5,4,3,2,1

        int[] arr  = {1,2,3,4,5};
        for (int i = 0,j = 4; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
