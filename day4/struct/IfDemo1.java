package com.learn.struct;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //单选择结构
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        //queals:判断字符串是否相等
        if (s.equals("Hello")) {
            System.out.println(s);
        }
        System.out.println("End");
        scanner.close();



    }
}
