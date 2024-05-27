package com.xiao.Practice1;

/**
 * ClassName: Main
 * Package: com.xiao.Practice1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.radius = 10.2;
        circle2.radius = 12.3;
        System.out.println("第一个圆半径为："+circle1.radius+"周长为："+2*Math.PI*circle1.radius+"面积为："+Math.PI*circle1.radius*circle1.radius);
        System.out.println("第二个圆半径为："+circle2.radius+"周长为："+2*Math.PI*circle2.radius+"面积为："+Math.PI*circle2.radius*circle2.radius);
    }
}
