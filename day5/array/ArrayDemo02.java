package com.learn.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1, 2, 3};
        System.out.println(a[0]);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //动态初始化
//        int[] b = new int[10];
//        //未赋值则默认为0
//        b[0] = 10;
//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);

    }
}
