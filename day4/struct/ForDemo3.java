package com.learn.struct;

public class ForDemo3 {
    public static void main(String[] args) {
        //
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0){
                System.out.print(i + "\t");
            }
            if (i % 15 == 0){
                System.out.println();
            }
        }
        //println输出完会换行
        //print输出完不会换行
    }
}
