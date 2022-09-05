package com.learn.struct;

public class ForDemo5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }

        //遍历数组元素，增强for循环
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
