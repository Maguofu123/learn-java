package com.oop.demo02;


public class Person {
    //默认存在方法


    String name;
    int age;


    //构造器
    //实例化初始值
    //构造器作用
    //alt + insert


    public Person() {
    }

    //有参构造

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
