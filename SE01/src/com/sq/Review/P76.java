package com.sq.Review;

import java.util.Scanner;

public class P76 {
    public static void main(String[] args) {
        /*评委打分：
         * 需求：在歌唱比赛中，有6名评委给选手打分，分数的范围是[0-100]之间的整数。
         * 选手的最后得分为：去掉最高分、最低分后四个评委的平均分，请完成上述过程并计算出选手的得分*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入六个评委的打分：");
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //     键盘录入成绩存入数组
        int max = arr[0];
        int min = arr[0];
        // 定义最大值和最小值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            //     循环找出最大值
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            //     循环找出最小值
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //     循环遍历求和
        }
        double grade = (sum - max - min) / 4;
        System.out.println("该选手最后的得分为：" + grade);
    }
}
