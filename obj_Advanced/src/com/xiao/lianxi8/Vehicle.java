package com.xiao.lianxi8;

/**
 * ClassName: Vehicle
 * Package: com.xiao.lianxi8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 14:36
 * @Version 1.0
 */
public abstract class Vehicle {
    //轮子数量
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }
}
