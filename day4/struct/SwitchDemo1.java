package com.learn.struct;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {


        //
        char grade = 'A';

        //case穿透，不写break会导致穿透
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break; //可选
            case 'B':
                System.out.println("良好");
            case 'C':
                System.out.println("及格");
            case 'D':
                System.out.println("挂科");
            default:
                System.out.println("未知");

        }

    }
}
