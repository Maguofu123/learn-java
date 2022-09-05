package com.learn.struct;

public class ForDemo1 {
    public static void main(String[] args) {
        //初始化
        int a = 1;
        //条件判断
        while (a <= 100){
            System.out.println(a);//循环体
            a += 2;//迭代
        }
        System.out.println("while end!");


        //初始化；条件判断；迭代
        for (int i = 1; i <= 100; i++){
            System.out.println(i);

        }
        System.out.println("for end!");

        /*
        for循环说明
        1.最先执行初始化，可以类型，一个或多个语句，也可以是空语句
        2.检测布尔表达式值，为true执行，false终止，执行循环体后面语句
        3.执行循环后，更新循环控制变量
        4.在此检测布尔表达式的值，循环执行上述过程
         */

        //for (; ; i++)

    }
}
