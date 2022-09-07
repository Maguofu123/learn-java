package com.oop.demo05;

//
//Person 人：父类
public class Person {
    protected String name = "AA";

    public Person() {
        System.out.println("Person无参执行了");
    }

    public void print(){
        System.out.println("Person");
    }

    //public
    //protected
    //default
    //private

//    private int money = 10_0000_0000;
//    public void say(){
//        System.out.println("说了一句话");
//    }
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
}
