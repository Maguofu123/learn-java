package com.colloection;

import com.oop.demo05.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        //集合
        //单列集合，双列集合
        //Collection 的子接口List和Map都是单列集合
        //Map 接口的实现子类时是双列集合，存放的K-V
        List list = new ArrayList();
        list.add("1");
        list.add("jack");
        list.add(true);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("jack"));
        List list1 = new ArrayList();
        list1.add("2");
        list1.add("3");
        list.addAll(list1);
        System.out.println(list);


    }
}
