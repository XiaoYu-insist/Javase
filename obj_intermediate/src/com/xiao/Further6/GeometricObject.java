package com.xiao.Further6;

/**
 * ClassName: GeometricObject
 * Package: com.xiao.Further6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 15:29
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findArea();
}
