package com.oop.demo01;


import java.io.IOException;

//Demo01 类
public class Demo01 {

    //main 方法
    public static void main(String[] args) {

    }

    public String sayHello(){
        return "Hello, world";
    }

    public int max(int a, int b){
        return a > b ? a : b;//三元运算符
    }

    //抛出异常
    public void readFiles(String file) throws IOException{

    }
}
