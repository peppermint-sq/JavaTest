package com.sq.Test.D06;

public class T6 {
    public static void main(String[] args) {
//需求：定义一个方法equals(int[] arr1,int[] arr2).
//功能：比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）

        int arr1[] = {1,2,3,2,5};
        int arr2[] = {1,2,3,4,5};
        equals(arr1,arr2);
    }
    public static void equals(int[] arr1,int[] arr2){
        if(arr1.length==arr2.length){
            for(int i = 0;i<arr1.length;i++){
                if(arr1[i]==arr2[i]){

                }else{
                    System.out.println("不相等");
                    return;
                }
            }
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}

