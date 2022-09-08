package com.oop.demo07;

public  class Person {
    {
        //匿名代码块，赋初始值
        System.out.println("匿名代码块");
    }

    static {
        //静态代码块
        System.out.println("静态代码块");
    }

    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========");
        Person person1 = new Person();

    }
}
