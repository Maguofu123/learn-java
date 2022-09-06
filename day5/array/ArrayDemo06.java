package com.learn.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 55, 12, 123123, 234, 33, -1, -222};

//        System.out.println(a);
//        System.out.println(Arrays.toString(a));
//        printArray(a);
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));


    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i == a.length - 1){
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }

        }
    }
}
