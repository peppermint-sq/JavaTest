package com.sq.Test.D05;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
//有一个数组，其中有十个元素从小到大依次排列
// {12,14,23,45,66,68,70,77,90,91}。
// 再通过键盘录入一个整数数字。要求：把数字放入数组序列中，
// 生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
//请输入一个整数数字：
//50
//生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
        int[] arr1 = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int num = sc.nextInt();
        int[] arr2 = new int[11];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>num){
                arr2[i+1]=arr1[i];
            }else {
                arr2[i]=arr1[i];
                index = i+1;//为什么要放在这里，为什么要加一
                //因为原数组是从小到大排列的，else部分是数组中小于num的部分，
                // 一直到最后一个小于num的数字，所以num替换的是第i+1个数字。
                // 同时因为是从小到大排列，所以依次遍历过后等数值大于num就不会再进入else部分了，
                // 这样往后遍历index的数值也不会因为循环发生变化，若放在if中index则会一直变化。
            }
        }
        arr2[index]=num;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
