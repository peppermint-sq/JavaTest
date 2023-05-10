package com.sq.Review;

import java.util.Random;

public class P75important {
    public static void main(String[] args) {
        /*开发验证码：
         * 1.定义方法实现随机产生一个五位的验证码
         * 2.验证码格式：长度为5，前四位是大写字母或小写字母，最后一位是数字*/
//        分析：
//        在以后如果我们要在一堆没有什么规律的数据中随机抽取，可以先把这些数据放在数组中，再随机抽取一个索引

//        1、大写字母和小写字母都放到一个数组当中
        char[] ch = new char[52];//先定义一个数组
        for (int i = 0; i < ch.length; i++) {
            //循环遍历数组
            //ASCII码表中的数字强转成char类型，即可得到大小写字母,97是小写a
            if (i <= 25) {
                //添加小写字母，97---a
                ch[i] = (char) (97 + i);
            } else {
                //添加大写字母，65---A
                ch[i] = (char) (65 + i - 26);//-26是为了保证是从65开始增加
            }
            //循环遍历将字母添加到数组
        }
        //定义一个字符串类型的变量，用来记录最终的结果
        String result = "";//此时是空字符串

        // 2、随机抽取四次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(ch.length);
            // 利用随机索引，获取对应的元素
            // System.out.println(ch[randomIndex]);
            result = result + ch[randomIndex];//字符串拼接
        }//循环四次，随机抽取四次


        // 3、随机抽取一个数字0-9
        int number = r.nextInt(10);
        result = result + number;//将数字与之前的字符串进行拼接
        System.out.println(result);
    }
}
