package com.sq.Test.anotherTest;

import java.util.Scanner;
public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String String1,String2;
            int len1,len2;
            System.out.println("请输入第一个整数：");
            String1=sc.next();
            System.out.println("请输入第二个整数：");
            String2=sc.next();
            len1=String1.length();
            len2=String2.length();
            int len=Math.max(len1, len2);
            int arr1[]=new int[len];
            int arr2[]=new int[len];
            for(int i=0;i<len1;i++) {
                arr1[i]=String1.charAt(len1-1-i)-'0';
            }
            for(int i=0;i<len2;i++) {
                arr2[i]=String2.charAt(len2-1-i)-'0';
            }
            int lenmax=len+1;
            int arradd[]=new int[lenmax];
            for(int i=0;i<lenmax-1;i++) {
                arradd[i]=arr1[i]+arr2[i];

            }
            for(int i=0;i<lenmax-1;i++) {
                arradd[i+1]=arradd[i+1]+arradd[i]/10;
                arradd[i]=arradd[i]%10;
            }
            int index=0;
            for(int i=arradd.length-1;i>=0;i--) {
                if(arradd[i]==0) {
                    continue;
                }
                if(arradd[i]!=0) {
                    index=i;
                    break;
                }
            }
            for(int i=index;i>=0;i--) {
                System.out.print(arradd[i]);
            }
        }
}
