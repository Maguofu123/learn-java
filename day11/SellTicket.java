package com.thread;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();


    }
}

//使用Thread方式
class SellTicket01 extends Thread{
    private static int num = 100;
    @Override
    public void run() {
        while (true){

            if (num <= 0){
                System.out.println("sell out");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + " 剩余票数" + (--num));
        }
    }
}
class SellTicket02 implements Runnable{
    private int num = 100;
    @Override
    public void run() {
        while (true){

            if (num <= 0){
                System.out.println("sell out");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + " 剩余票数" + (--num));
        }
    }
}