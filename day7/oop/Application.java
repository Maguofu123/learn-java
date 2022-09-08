package com.oop;


import com.oop.demo06.Person;
import com.oop.demo06.Student;
import com.oop.demo06.Teacher;
import com.oop.demo08.A;
import com.oop.demo08.Action;
import com.oop.demo10.Outer;

////一个项目应该只有一个main方法
public class Application {
    public static void main(String[] args) {

        Outer outer = new Outer();

        //通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.getID();

    }
}
//        A a = new A();
//        a.doSomething();
//
//    }
//}
//
//        //高                     低
//        Person obj = new Student();
//
//        //student.go();
//
//        //强制转换
//
//        Student student = (Student) obj;
//        student.go();
//    }
//
//}
//
//    //静态方法和非静态方法区别很大
//    public static void main(String[] args) {
//
//
//        //Object > Person > Student
//        Object object = new Student();
//        System.out.println(object instanceof Student);
//        System.out.println(object instanceof Person);
//        System.out.println(object instanceof Object);
//        System.out.println(object instanceof Teacher);
//        System.out.println(object instanceof String);
//        System.out.println("============================");
//        Person person = new Student();
//        System.out.println(person instanceof Student);
//        System.out.println(person instanceof Person);
//        System.out.println(person instanceof Object);
//        System.out.println(person instanceof Teacher);
//        //System.out.println(person instanceof String);
//        System.out.println("============================");
//        Student student = new Student();
//        System.out.println(student instanceof Student);
//        System.out.println(student instanceof Person);
//        System.out.println(student instanceof Object);
//        //System.out.println(student instanceof Teacher);
//        //System.out.println(person instanceof String);



//        //一个对象的实际类型是确定的
//
//        //可以指向的引用类型就不确定了；父类的引用指向子类
//        Student s1 = new Student();
//        Person s2 = new Student();
//        Object s3 = new Student();
//
//
//        //
//        //s2.eat();//子类重写了方法
//        s1.eat();
//        s1.give();
//        s1.giveName("mike");
//        s1.printName();


//        //静态方法： 方法的调用只和左边，定义的数据类型有关
//        A a = new A();
//        a.test();
//
//        //父类的引用指向子类
//        B b = new A();
//        b.test();


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





