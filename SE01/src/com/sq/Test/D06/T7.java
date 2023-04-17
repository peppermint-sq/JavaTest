package com.sq.Test.D06;

public class T7 {
    public static void main(String[] args) {
//需求：定义一个方法fill(int[] arr,int value)
//功能：将数组arr中的所有元素的值改为value
        int[] arr = {1,2,3};
//        int value = 88;
        fill(arr,88);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

}
