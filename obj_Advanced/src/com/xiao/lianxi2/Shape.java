package com.xiao.lianxi2;

/**
 * ClassName: Shape
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 16:10
 * @Version 1.0
 */
public class Shape {
    public double area(){
        return 0.0;
    }
    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" + "面积=" + area() + ", 周长=" + perimeter() + '}';
    }
}
