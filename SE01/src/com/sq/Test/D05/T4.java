package com.sq.Test.D05;

public class T4 {
    public static void main(String[] args) {
//现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
// 从数组的最大索引位置开始到最小索引位置，
// 依次表示整数的个位、十位、百位。。。依次类推。
// 请编写程序计算，这个数组所表示的整数值。例如：
//数组：{2, 1, 3, 5, 4}
//表示的整数为：21354
// 注：是整数类型的两万一千三百五十四，不是字符串
        int[] arr = {2,1,3,5,4};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10+ arr[i];
        }
        System.out.println(number);
    }
}
