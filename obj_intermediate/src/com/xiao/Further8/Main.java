package com.xiao.Further8;

/**
 * ClassName: Main
 * Package: com.xiao.Further8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/25 15:33
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle("red",5.6,4.1);
        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.equals(c2));
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
