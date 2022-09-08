package com.oop.demo07;

//static :静态
public class Student extends Person{
    private static int age;//静态变量 多线程
    private double score;//非静态变量

    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {
        Student student = new Student();
        student.run();

        go();
        Student.go();
    }
}
