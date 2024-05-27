package com.xiao.lianxi7;

/**
 * ClassName: Triangle
 * Package: com.xiao.lianxi7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/10 21:59
 * @Version 1.0
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "边长：" + a +
                "," + b +
                "," + c +
                "," + super.toString();

    }
}
