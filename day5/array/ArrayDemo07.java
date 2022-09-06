package com.learn.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {123,432, 4536, 123, 345, 345, 2};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    public static int[] sort(int[] array){
        //临时变量
        int temp = 0;
        //外层循环
        for (int i = 0; i < array.length - 1; i++) {

            boolean flag = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
        return array;
    }
}
