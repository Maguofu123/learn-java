package com.colloection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        if (arrayList instanceof List) {
            arrayList.add(new Dog("A", 5));
            arrayList.add(new Dog("B", 6));
            arrayList.add(new Dog("C", 7));
        }
        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}