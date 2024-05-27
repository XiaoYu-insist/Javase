package com.xiao.lianxi2;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/22 15:52
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //用一个数组用来存储各种图形的对象，并且按照各种图形的面积进行排序
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        Circle c2 = new Circle();
        c2.setRadius(1.5);

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(1);

        Rectangle r2 = new Rectangle();
        r2.setLength(4);
        r2.setWidth(2);

        Graphic[] shapes = new Graphic[4];
        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = r1;
        shapes[3] = r2;

        System.out.println("排序前：");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getInfo());
        }

        //按照面积排序
        for (int i = 1; i < shapes.length; i++) {
            for (int j = 0; j < shapes.length - i; j++) {
                if(shapes[j].area() > shapes[j+1].area()){
                    Graphic temp = shapes[j];
                    shapes[j] = shapes[j+1];
                    shapes[j+1] = temp;
                }
            }
        }

        System.out.println("排序后：");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getInfo());
        }
    }
}
