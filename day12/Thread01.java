package com.method;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("1");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 5; i++) {
            //Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t.getName() + "线程的优先级" + t.getPriority());
        t.interrupt();

    }
}

class T extends Thread{
    @Override
    public void run() {
        while (true) {


            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "A" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被中断了");
            }
        }
    }

}