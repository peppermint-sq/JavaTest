package com.sq.Review;

import java.util.Scanner;

public class p76_1 {
    public static void main(String[] args) {
        // 1.定义一个数组，用来存储6名评委的打分（0~100）
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        //     2.求出数组的最大值
        int max = getMax(scoreArr);
        //     3.求出数组的最小值
        int min = getMin(scoreArr);
        //     4.求出数组中六个分数的总和
        int sum = getSum(scoreArr);
        //     5.（总和-最大值-最小值）/4
        int avg = (sum - max - min) / 4;
        //     打印结果
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println("选手最终得分为：" + avg);
    }

    // 求和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    // 求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    // 求数组的最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }//shift+f6批量更改
        return min;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分：");
            int score = sc.nextInt();//100
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入，当前的i为：" + i);
            }
        }
        return scores;
    }
}
