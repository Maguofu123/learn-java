package com.learn.struct;

//99乘法表


public class ForDemo4 {
    public static void main(String[] args) {
        for (int j = 0; j <= 9; j++) {//外层循环
            for (int i = 0; i <= j; i++) {//内层循环
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");//调整样式
            }
            System.out.println();//换行
        }

    }
}
