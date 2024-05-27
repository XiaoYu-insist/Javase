package com.xiao.Further6;

/**
 * ClassName: Circle
 * Package: com.xiao.Further6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 15:31
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
