package com.oop.demo01;

public class Demo02 {
    //静态类 static


    //非静态方法
    public static void main(String[] args) {
        //实例化
        //对象类型 对象名 = 对象值
//       Student student = new Student();
//       student.say();
       //两种方法
       new Student().say();
    }


    //static静态方法 和类一起加载
    public void a(){
        b();
    }
    //非静态方法 类实例化后才存在
    public void b(){

    }
}
