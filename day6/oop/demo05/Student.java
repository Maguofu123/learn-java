package com.oop.demo05;

//学生 子类
public class Student extends Person{
    //隐藏代码：调用无参构造
    //super();调用父类构造器必须要在子类构造器的第一行
    public Student() {
        System.out.println("Student无参执行了");
    }

    private String name = "BB";

    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
