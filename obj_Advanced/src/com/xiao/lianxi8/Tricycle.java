package com.xiao.lianxi8;

/**
 * ClassName: Tricycle
 * Package: com.xiao.lianxi8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 14:44
 * @Version 1.0
 */
public class Tricycle extends Vehicle{
    public Tricycle(int wheels){
        super(wheels);
    }

    @Override
    public void drive() {
        System.out.println("脚踏三轮车，稳稳当当往前走");
    }
}
