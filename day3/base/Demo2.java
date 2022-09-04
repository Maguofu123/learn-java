package base;

public class Demo2 {
    public static void main(String[] args) {
        /*
        * 数据类型拓展
        * 前缀：
        * 二进制0b
        * 八进制0
        * 十进制
        * 十六进制0x
        * */

        int num1 = 10;
        int num2 = 010;
        int num3 = 0x10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //浮点数拓展
        //BigDecimal类
        float n1 = 0.1f;
        double n2 = 1.0 / 10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 == n2);

        //字符拓展
        char c1 = 'a';
        char c2 = '我';
        System.out.println(c1);
        System.out.println(c2);

        // Unicode编码
        // 如下
        char c3 = '\u0061';
        System.out.println(c3);

        //转义字符
        // \t制表符
        // \n缓缓


    }
}
