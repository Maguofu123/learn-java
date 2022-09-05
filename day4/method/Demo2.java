package com.learn.method;

public class Demo2 {
    public static void main(String[] args) {
        double max = max(10, 10);
        System.out.println(max);

    }
    //比大小
    public static double max(int num1, int num2){
        int result = 0;

        if (num1 == num2){
            System.out.println("num1 = num2");
            return 0;
        }
        if (num1 > num2) {
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
    //重载只要参数不同即可
    public static double max(double num1, double num2){
        double result = 0;

        if (num1 == num2){
            System.out.println("num1 = num2");
            return 0;
        }
        if (num1 > num2) {
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
}
