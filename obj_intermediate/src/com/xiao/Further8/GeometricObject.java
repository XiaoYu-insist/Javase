package com.xiao.Further8;

/**
 * ClassName: GeometricObject
 * Package: com.xiao.Further8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/25 15:23
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(){
        this.color = "white";
        this.weight = 1.0;
    };
    protected GeometricObject(String color, double weight){
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
}
