package operator;

public class Demo7 {
    public static void main(String[] args) {
        //x ? y : z
        //若x为true，则y，否则z

        int score = 50;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);
    }
}
