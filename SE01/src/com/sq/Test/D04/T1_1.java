package com.sq.Test.D04;

public class T1_1 {
    public static void main(String[] args) {
// 李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
// 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，
// 新手机就能够打8折优惠。
// 为了更省钱，李雷要不要以旧换新？请在控制台输出。
      int newPhone = 7988;
      int oldPhone = 1500;
      int ershou = newPhone - oldPhone;
      double store = newPhone*0.8;
      if(ershou>store){
          System.out.println("不要以旧换新");
      }
      else{
          System.out.println("要以旧换新");
      }
    }
}
