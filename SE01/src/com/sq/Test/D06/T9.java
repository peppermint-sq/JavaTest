package com.sq.Test.D06;

public class T9 {
    public static void main(String[] args) {
// 需求：定义一个方法copyOf(int[] arr, int newLength)
//功能：将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，
// 从索引为0开始
        int[] arr = {1,2,3,4,5,6,7};
        copyOf(arr, 4);

    }

    public static int[] copyOf(int[] arr, int newLength){

        int[] arr1 = new int[newLength];
        for (int i = 0; i < newLength; i++) {
                arr1[i] = arr[i];
                System.out.print(arr1[i]+" ");
        }
        return arr1;
    }
}
