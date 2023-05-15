package com.sq.Review;

import java.util.Scanner;

public class P77 {
    public static void main(String[] args) {
        /*数字加密：
         * 需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输
         * 规则如下：
         * 先得到每位数，然后每位数都加上5，再对10取余，最后将数字反转，得到一串新数*/
        //     1.先得到数字密码，并将密码存入数组
        int[] password = getNum();
        //     2.将每位数加上5再对10取余
        operation(password);
        //     3.将数组顺序反转
        getReturn(password);
        //     4.得到新数并输出
        getNewnum(password);

    }

    public static int getNewnum(int[] password) {
        int newNum = 0;
        for (int i = 0; i < password.length; i++) {
            newNum = password[i] + newNum * 10;
        }
        System.out.println("转换后的数字密码是" + newNum);
        return newNum;
    }

    public static int[] getReturn(int[] password) {
        int index = 0;
        for (int i = 0, j = password.length - 1; i < j; i++, j--) {
            index = password[i];
            password[i] = password[j];
            password[j] = index;
        }
        return password;
    }

    public static int[] operation(int[] password) {
        for (int i = 0; i < password.length; i++) {
            password[i] = (password[i] + 5) % 10;
        }
        return password;
    }

    public static int[] getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四位数密码：");
        int num = sc.nextInt();
        int[] arr = new int[4];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }
        return arr;
    }
}
