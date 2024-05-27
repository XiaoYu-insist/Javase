package com.xiao.lianxi2;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 17:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle(3,6);
        Triangle t1 =new Triangle(3,4,5);
        Triangle t2 =new Triangle(6,6,6);
        ShapeTools.compare(r1,t1);
        ShapeTools.equals(r2,t2);
        Shape[] s = new Shape[]{r1,r2,t1,t2};
        ShapeTools.print(s);
        System.out.println("-------------------");
        ShapeTools.sort(s);
        ShapeTools.print(s);
    }
}
