package com.oop.demo10;

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类
        new Apple().eat();
        Apple apple = new Apple();

        new UserService(){

            @Override
            public void hello() {

            }
        };

    }
}

class  Apple{
    public void eat(){
        System.out.println("1");
    }
}


interface UserService{
    void hello();
}