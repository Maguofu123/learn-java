package com.thread;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {

        //创建Cat对象
        Cat cat = new Cat();
        cat.start();//启动线程

        //主线程和子线程交替执行
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }


    }
}

//继承Thread类，该类就可以当作线程使用
class Cat extends Thread{
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        int times = 0;

        while(true) {
            System.out.println("test" + (++times) + Thread.currentThread().getName());
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80){
                break;
            }
        }

    }
}