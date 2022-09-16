package com.thread;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        //不能调用start方法
//        Thread thread = new Thread(dog);
//        thread.start();

    }
}
class Proxy implements Runnable{
    private Runnable target = null;

    public Proxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
    @Override
    public void run() {
        if (target != null){
            target.run();
        }

    }
}
class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("Hi" + (++count) + Thread.currentThread().getName());
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