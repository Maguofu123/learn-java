package com.learn.struct;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //双选择结构
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入成绩：");
        int score = scanner.nextInt();

        if (score > 60){

            System.out.println("及格");

        }else {
            System.out.println("不及格");
        }



        scanner.close();
    }
}