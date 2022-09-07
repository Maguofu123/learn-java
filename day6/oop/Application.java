package com.oop;

import com.oop.demo03.Pet;
import com.oop.demo05.A;
import com.oop.demo05.B;
import com.oop.demo05.Person;
import com.oop.demo05.Student;

////一个项目应该只有一个main方法
public class Application {

    //静态方法和非静态方法区别很大
    public static void main(String[] args) {

        //静态方法： 方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();

        //父类的引用指向子类
        B b = new A();
        b.test();

    }
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.test("CC");
//        student.test1();
//
//
//    }
//    public static void main(String[] args) {
//        Student student = new Student();
//        student.say();
//        System.out.println(student.getMoney());
//
//    }
//    public static void main(String[] args) {
//        Student s1 = new Student();
//
//        s1.setName("AB");
//        System.out.println(s1.getName());
//
//
//        s1.setAge(60);
//        System.out.println(s1.getAge());
//    }

}

//    public static void main(String[] args) {
//        Pet dog = new Pet();
//        dog.name = "旺财";
//        dog.age = 3;
//        dog.shout();
//
//        System.out.println(dog.name);
//        System.out.println(dog.age);
//
//        Pet cat = new Pet();
//
//
//    }

//    public static void main(String[] args) {
//
//        //实例化对象
//        Person person = new Person("cd", 5);
//        System.out.println(person.name);
//        System.out.println(person.age);





