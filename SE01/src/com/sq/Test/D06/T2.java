package com.sq.Test.D06;

public class T2 {
    public static void main(String[] args) {
//        定义一个方法，该方法能够找出三个整数中的最大值并返回。
//        在主方法中调用方法测试执行。
        System.out.println(getMax(223,42,324));
    }
    public static int getMax(int num1,int num2,int num3){
        if(num1 > num2 & num1 > num3){
            return num1;
        } else if (num2 > num1 & num2 > num3) {
            return num2;
        }else {
            return num3;
        }
    }
}
