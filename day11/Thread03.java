package com.thread;

public class Thread03 {
    public static void main(String[] args) {
        ThreadCreat01 threadCreat01 = new ThreadCreat01();
        ThreadCreat02 threadCreat02 = new ThreadCreat02();
        threadCreat01.start();
        Thread thread = new Thread(threadCreat02);
        thread.start();

    }
}

class ThreadCreat01 extends Thread{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}
class ThreadCreat02 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}