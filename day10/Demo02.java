package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add(1, "C");
        System.out.println(list);
        System.out.println(list.indexOf("C"));
    }
}
