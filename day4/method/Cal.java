package com.learn.method;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        String c;
        System.out.println("输入数字a");
        a = scanner.nextDouble();
        System.out.println("输入数字b");
        b = scanner.nextDouble();
        System.out.println("输入运算符");
        c = scanner.next();
        switch (c){
            case "+":
                System.out.println(add(a, b));
                break;
            case "-":
                System.out.println(min(a, b));
                break;
            case "*":
                System.out.println(mul(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
        }



    }
    public static double add(double a, double b){
        return a + b;
    }
    public static double min(double a, double b){
        return a - b;
    }
    public static double mul(double a, double b){
        return a * b;
    }
    public static double div(double a, double b){
        return a / b;
    }
}
