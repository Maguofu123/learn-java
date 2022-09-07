package com.oop.demo04;

//类
public class Student {
    //属性封装
    //名字、学号、性别
    private String name; //属性私有
    private int id;
    private char sex;
    private int age;

    //提供操作属性的方法  get
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 120 || age < 0){
            this.age = 3;
        } else {
            this.age = age;
        }
    }
    //学习（）
    //睡觉（）
}
