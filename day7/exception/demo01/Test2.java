package com.exception.demo01;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
