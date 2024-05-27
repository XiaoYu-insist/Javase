package com.xiao.Further4;

/**
 * ClassName: Cylinder
 * Package: com.xiao.Further4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 16:48
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;
    public Cylinder(){
        this.length = 1;
    }

    public double findVolume(){
        return findArea()*getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
