package com.learn.method;

public class Demo1 {
    //main方法
    public static void main(String[] args) {
//        int sum = add(1,2);
//        System.out.println(sum);
        test();
    }

    //加法
    //形式参数，用来定义
    //重载
    public static int add(int a, int b){
        return a + b;
    }
    public static float add(float a, float b){
        return a + b;
    }
    public static int add(double a, int b){
        return (int)a + b;
    }
    public static void test(){
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0){
                System.out.print(i + "\t");
            }
            if (i % 15 == 0){
                System.out.println();
            }
        }
    }
}
