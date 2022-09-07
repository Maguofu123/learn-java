package com.oop.demo02;

//学生类
public class Student {
    //属性：字段
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(this.name + "在学习");
    }

}

/*
  public static void main(String[] args) {

        //类是抽象的，需要实例化
        //实例化后会返回一个自己的对象
        //对象是一个类的具体实例

        Student xm = new Student();
        Student xh = new Student();

        xm.name = "小明";
        xm.age = 3;

        System.out.println(xm.name);
 */