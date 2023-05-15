package com.sq.Review;

import java.util.Random;

public class P78 {
    public static void main(String[] args) {
        /*抢红包
         * 需求：
         * 一个大v直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
         * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现随机且不重复*/
        int[] money = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < money.length; i++) {
            int index = r.nextInt(4);//生成随机索引与i索引交换值
            int temp = 0;//用来调换对应索引的数值
            temp = money[i];
            money[i] = money[index];
            money[index] = temp;
        }
        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i]+"元奖金被抽中");
        }
    }
}
