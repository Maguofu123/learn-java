package com.learn.array;

public class ArrayDemo01 {
    //变量类型  变量名字  = 变量的值
    public static void main(String[] args) {
        int[] nums;//1.定义（首选）

        //int nums[];  2.定义（不用此定义方法）

        nums = new int[10]; //存放十个int类型数字，仅创建一个数组

        //给数组赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        System.out.println(nums[9]);

        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
