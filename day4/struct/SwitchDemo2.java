package com.learn.struct;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String name = "java学习";


        //反编译 java -- class -- 反编译(IDEA)


        switch (name){
            case "python学习":
                System.out.println("python");
                break;
            case "C++学习":
                System.out.println("C++");
                break;
            case "java学习":
                System.out.println("java");
                break;
            default:
                System.out.println("未知");
        }
    }
}
