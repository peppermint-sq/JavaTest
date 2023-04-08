package com.sq.Test.D04;

import java.util.Scanner;

public class T1_5 {
    public static void main(String[] args) {
// 2019年1月1日起，国家推出新的个人所得税政策，
// 起征点上调值5000元。也就是说税前工资扣除三险一金
// （三险一金数额假设是税前工资的10%）后如果不足5000元，
// 则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，
// 具体梯度比例如下：
//0 ~ 3000元的部分，交税3%
//3000 ~ 12000元的部分，交税10%
//12000 ~ 25000的部分 ， 交税20%
//25000 ~ 35000的部分，交税25%
//35000 ~ 55000的部分，交税30%
//55000 ~ 80000的部分，交税35%
//超过80000的部分，交税45%
//比如：黑马某学员入职一家企业后，税前工资是15000，
// 则他每月该交个税的部分是15000-1500-5000=8500元，
// 个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
//请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，
// 以及税后工资为多少？
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资：");
        double beforetax = sc.nextDouble();
        double tax = 0;
        double aftertax = beforetax - tax;
        if(beforetax*(1-0.1) >= 5000){
            if((beforetax*(1-0.1) - 5000) >0 & (beforetax*(1-0.1) - 5000) <= 3000){
                tax = (beforetax*(1-0.1) - 5000)*0.03;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else if ((beforetax*(1-0.1) - 5000) > 3000 & (beforetax*(1-0.1) - 5000) <= 12000) {
                tax = 3000*0.03 + (beforetax*(1-0.1)-5000-3000)*0.1;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else if ((beforetax*(1-0.1) - 5000) > 12000 & (beforetax*(1-0.1) - 5000) <= 25000) {
                tax = 3000*0.03 + (12000-3000)*0.1+ (beforetax*(1-0.1)-12000)*0.2;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else if ((beforetax*(1-0.1) - 5000) > 25000 & (beforetax*(1-0.1) - 5000) <= 35000) {
                tax = 3000*0.03 + (12000-3000)*0.1+ (25000-12000)*0.2 + (beforetax*(1-0.1)-25000)*0.25;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else if ((beforetax*(1-0.1) - 5000) > 35000 & (beforetax*(1-0.1) - 5000) <= 55000) {
                tax = 3000*0.03 + (12000-3000)*0.1 + (25000-12000)*0.2 + (35000-25000)*0.25 + (beforetax*(1-0.1)-35000)*0.3;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else if ((beforetax*(1-0.1) - 5000) > 55000 & (beforetax*(1-0.1) - 5000) <= 80000) {
                tax = 3000*0.03 + (12000-3000)*0.1+ (25000-12000)*0.2 + (35000-25000)*0.25 + (55000-35000)*0.3 + (beforetax*(1-0.1)-55000)*0.35;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            } else {
                tax = 3000*0.03 + (12000-3000)*0.1+ (25000-12000)*0.2 + (35000-25000)*0.25 + (55000-35000)*0.3 + (80000-55000)*0.35 + (beforetax-80000)*0.45;
                System.out.println("纳税数额为：" + tax);
                System.out.println("税后工资为：" + aftertax);

            }
        }else {
            System.out.println("不需要缴税");
            System.out.println("纳税数额为：" + 0);
            System.out.println("税后工资为：" + beforetax);
        }
    }
}
