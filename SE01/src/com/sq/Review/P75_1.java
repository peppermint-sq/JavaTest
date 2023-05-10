package com.sq.Review;

public class P75_1 {
    public static void main(String[] args) {
        /*数组元素的复制
         * 需求：把一个数组的元素复制到另一个新的数组中去*/
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
