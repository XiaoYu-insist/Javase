package com.xiao.Further4;

/**
 * ClassName: Main
 * Package: com.xiao.Further4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 16:56
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setRadius(3.2);
        cyl.setLength(8.2);
        System.out.println("圆柱体体积为："+cyl.findVolume());
    }
}
