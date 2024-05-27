package com.xiao.lianxi7;

/**
 * ClassName: Rectangle
 * Package: com.xiao.lianxi7
 * Description:
 * 声明一个矩形Rectangle，继承Shape父类
 * - 属性：长和宽，私有化
 * - 提供get/set
 * - 提供无参构造和有参构造
 * - 重写area()和perimeter方法，
 * - 重写toString方法，返回“长：xx，宽：xx，面积：xxx，周长：xxx”
 *
 * @Author xiao-yu
 * @Create 2024/5/10 16:59
 * @Version 1.0
 */
public class Rectangle extends Shape {
    private double leng;
    private double width;


    public Rectangle() {
    }

    public Rectangle(double leng, double width) {
        this.leng = leng;
        this.width = width;
    }

    public double getLeng() {
        return leng;
    }

    public void setLeng(double leng) {
        this.leng = leng;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return leng * width;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "长："+leng+"，宽："+width+super.toString();
    }
}
