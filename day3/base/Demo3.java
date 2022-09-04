package base;

public class Demo3 {
    public static void main(String[] args) {
        //类型转换
        int n1 = 128;
        byte n2 = (byte)n1;

        //强制转换 (type)var 高--低
        //自动转换 低--高


        System.out.println(n1);
        System.out.println(n2);

        /*
        布尔值无法转换
        对象类型
        转换会导致精度问题，比如float转换为int
        转换可能会导致内存溢出问题
         */

        int n = 10_0000_0000; //下划线用于区分
        System.out.println(n);

        //溢出问题

        int a = 10_0000_0000;
        int b = 200;
        int ab = a * b;
        System.out.println(ab);
        //-1863462912 不等于 200_0000_0000



        //int ab1 = (long)a * b;
        long ab2 = (long)a * b;
       // System.out.println(ab1);
        System.out.println(ab2);





    }
}
