package com.sq.Test.D06;

import jdk.nashorn.internal.ir.GetSplitState;

public class T1 {
    public static void main(String[] args) {
//    定义一个方法，该方法能够找出两个小数中的较小值并返回。
//    在主方法中调用方法进行测试。
        System.out.println(getMin(23,678));
    }
    public static int getMin(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
