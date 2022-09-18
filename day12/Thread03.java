package com.method;

public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("B");
            Thread.sleep(1000);
        }

    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A");
        }
    }
}