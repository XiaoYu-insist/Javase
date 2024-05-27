package com.xiao.lianxi8;

/**
 * ClassName: Bicycle
 * Package: com.xiao.lianxi8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 14:42
 * @Version 1.0
 */
public class Bicycle extends Vehicle {
    public Bicycle(int wheels) {
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏双轮自行车，优哉游哉往前走");
    }
}
