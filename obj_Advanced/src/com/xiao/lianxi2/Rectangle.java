package com.xiao.lianxi2;

/**
 * ClassName: Rectangle
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 16:12
 * @Version 1.0
 */
public class Rectangle extends Shape{
    private double lenth;
    private double width;

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(){}
    public Rectangle(double lenth, double width) {
        this.lenth = lenth;
        this.width = width;
    }

    @Override
    public double area() {
        return this.lenth * this.width;
    }

    @Override
    public double perimeter() {
        return this.lenth + this.lenth * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle [lenth=" + lenth + ", width=" + width + super.toString() + "]";
    }
}
