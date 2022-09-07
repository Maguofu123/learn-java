package com.oop.demo01;

//引用传递：对象
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Demo05.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        person.name = "AA";
    }


}


//定义Person类
class Person{
    String name;

}