package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        //可重复
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.get(0));

    }
}
