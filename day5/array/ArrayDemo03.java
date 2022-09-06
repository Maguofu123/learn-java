package com.learn.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

        //打印所有元素
        for (int i = 0; i < arrays.length; i++){
            System.out.print(arrays[i] + "\t");
        }
        //求和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println("\n" + "sum = " + sum);

       //查找最大元素
       int max = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.println("max = " + max);
    }
}
