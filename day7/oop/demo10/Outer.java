package com.oop.demo10;

public class Outer {

    private int id = 10;
    public void out(){
        System.out.println("这是外部类方法");
    }
    public class Inner{
        public void in(){
            System.out.println("这是内部类方法");
        }
        public void getID(){
            System.out.println(id);
    }

    //获得外部类私有属性

    }
}


