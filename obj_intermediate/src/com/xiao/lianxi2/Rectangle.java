package com.xiao.lianxi2;

/**
 * ClassName: Rectangle
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/22 15:31
 * @Version 1.0
 */
public class Rectangle extends Graphic{
    private double length;
    private double width;

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2*length+2*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getInfo() {
        return "长："+getLength()+"，高："+getWidth()+super.getInfo();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
