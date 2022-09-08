package com.exception.demo01;

public class Test {
    public static void main(String[] args) {
        new Test().test(1, 0);
        }

        //System.out.println(a / b);

    public void a(){
        b();
    }
    public void b(){
        a();
    }

    //
    public void test(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException();
        }
        //System.out.println(a / b);
    }
}


/*
 try {
            if (b == 0){
                throw new ArithmeticException();
            }
        }catch (Exception e){
            System.out.println("Exception");
        }

        try {//try监控区域
            new Test().a();
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Error e){
            System.out.println("Error");
        }catch (Throwable e){ //捕获异常
            System.out.println("程序出现异常，变量b不能为零");
        }
        finally { // 处理善后工作
            System.out.println("finally");
 */