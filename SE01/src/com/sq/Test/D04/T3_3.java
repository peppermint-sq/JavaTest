package com.sq.Test.D04;

public class T3_3 {
    public static void main(String[] args) {
//需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
//假如我有一张足够大的纸，它的厚度是0.1毫米。
//请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        int number = 0;
        for(double i = 0.1;i<=8844430;i = i*2){
        number = number+1;
        }
        System.out.println(number);
    }
}
