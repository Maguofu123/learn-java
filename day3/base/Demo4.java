package base;

public class Demo4 {
    //类变量 static
    static double b = 100;


    //属性
    //实例变量，在类里面，从属于对象
    //默认值为 0 0.0
    //布尔值默认false
    //除了基本类型，其他默认值为null
    int age;




    //main方法
    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println(i);

        Demo4 a = new Demo4();
        System.out.println(a.age);

        System.out.println(b);

    }
    public void add(){

    }
}
