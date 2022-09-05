package com.learn.struct;

public class ForDemo2 {
    public static void main(String[] args) {
        //0-100

        int a = 0;
        int b = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){//奇数
                a += i;
            }else { //偶数
                b += i;
            }
        }
        System.out.println("奇数和：" + a);
        System.out.println("偶数和：" + b);
    }
}
