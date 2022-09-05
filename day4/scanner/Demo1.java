package com.learn.scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //创建扫描器对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        //判断
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出的内容为：" + str);
        }

        //关闭IO流的类，节约资源
        scanner.close();
    }
}
