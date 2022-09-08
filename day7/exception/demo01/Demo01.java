package com.exception.demo01;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(11 / 0);

    }

    public void a(){
         b();
    }
    public void b(){
        a();
    }
}
