package com.thread;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cupNums = runtime.availableProcessors();
        System.out.println(cupNums);
    }
}
