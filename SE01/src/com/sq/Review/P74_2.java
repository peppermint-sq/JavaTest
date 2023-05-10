package com.sq.Review;

public class P74_2 {
    public static void main(String[] args) {
//        找质数
//        判断101-200之间有多少个素数，并输出所有素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean temp = true;//假设默认是质数
            for (int j = 2; j < 99; j++) {
                if (i % j == 0) {
//                    如果可以整除，则不是质数
                    temp = false;
                    break;//break跳出单层循环
                }
            }
            if(temp ==true){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("有" + count + "个素数");
    }
}

