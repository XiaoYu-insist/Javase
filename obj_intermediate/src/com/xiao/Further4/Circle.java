package com.xiao.Further4;

/**
 * ClassName: Circle
 * Package: com.xiao.Further4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 16:47
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public Circle() {
        this.radius = 1;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
