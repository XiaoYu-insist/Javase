package com.xiao.lianxi7;

/**
 * ClassName: Shape
 * Package: com.xiao.lianxi7
 * Description:
 *   声明一个抽象图形父类Shape，包含
 * - public abstract double area()
 * - public abstract double perimeter()
 * - public String toString()：返回“面积：xxx，周长：xxx”
 * @Author xiao-yu
 * @Create 2024/5/10 16:56
 * @Version 1.0
 */
public abstract class Shape {
    public abstract double area(); //面积
    public abstract double perimeter(); // 周长

    @Override
    public String toString() {
        return "面积："+ this.area()+"，周长："+this.perimeter();
    }
}
