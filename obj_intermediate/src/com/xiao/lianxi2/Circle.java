package com.xiao.lianxi2;

/**
 * ClassName: Circle
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/22 15:28
 * @Version 1.0
 */
public class Circle extends Graphic{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getInfo() {
        return "半径："+getRadius()+super.getInfo();
    }
}
