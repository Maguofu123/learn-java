package com.learn.struct;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0){
            System.out.println(a);
        }
        System.out.println("==================");
        do{
            System.out.println(a);
        }while (a < 0);
    }
}
