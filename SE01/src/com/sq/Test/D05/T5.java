package com.sq.Test.D05;

public class T5 {
    public static void main(String[] args) {
//    定义一个数组来存储10个学生的成绩，
//    例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
//    计算并输出学生的平均成绩。
    int[] arr = {72,89,65,87,91,82,71,93,76,68};
    double sum = 0;
    double aver = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        aver = sum/10;
        System.out.println("平均成绩为："+aver);
    }
}
