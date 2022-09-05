package com.learn.method;

public class Demo4 {
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.test(1, 2, 3);

    }
    public void test(int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
    }

}
