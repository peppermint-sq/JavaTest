package com.sq.Test.D03;

public class T2 {
    public static void main(String[] args) {
//    红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
//    绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
//    那么红茶和绿茶现在的钱一样多，请问对么？
        int red = 21;
        int green = 24;
        red = 3*red + 3;
        green = 2*green;
        System.out.println(red==green);
    }

}
