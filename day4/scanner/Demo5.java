package com.learn.scanner;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //定义
        double sum = 0;
        //计算
        int m = 0;
        System.out.println("输入数据");

        //循环
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m++;

            sum += x;
            System.out.println("你输入了第" + m + "个数据" + " 当前值为" + sum);


        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));




        scanner.close();
    }

}
