package com.method;

public class Thread02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程运行" + i + "次");
            if (i == 5){
                System.out.println("子线程开始运行");
                //t2.join();//子线程插队
                //System.out.println("子线程运行结束，主线程开始运行");

                Thread.yield();
                System.out.println("yield");
            }
        }



    }
}

class T2 extends Thread{
    @Override
    public void run() {



            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("子线程运行" + i + "次");
            }


        }
    }

