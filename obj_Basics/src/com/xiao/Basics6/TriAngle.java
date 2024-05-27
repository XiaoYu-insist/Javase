package com.xiao.Basics6;

/**
 * ClassName: TriAngle
 * Package: com.xiao.Basics6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/18 16:26
 * @Version 1.0
 */
public class TriAngle {
    private int base;
    private int height;

    public TriAngle(int base, int height) {
        this.base = base;

        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea() {
        return base*height;
    }
}
