package com.sq.Test.D05;

public class T7 {
    public static void main(String[] args) {
//    定义一个数组其中包含多个数字。用自己的方式最终实现，
//    奇数放在数组的左边，偶数放在数组的右边。
//    （可以创建其他数组，不必须在原数组中改变）
        int[] arr = {21,23,34,45,56,43,36,66,35,67};
        int[] arr1 = new int[10];
        int a = 9;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr1[a] = arr[i];
                a--;
            }else{
                arr1[b] = arr[i];
                b++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
