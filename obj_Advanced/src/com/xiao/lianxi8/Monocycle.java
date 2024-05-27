package com.xiao.lianxi8;

/**
 * ClassName: Monocycle
 * Package: com.xiao.lianxi8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 14:40
 * @Version 1.0
 */
public class Monocycle extends Vehicle{

    public Monocycle(int wheels){
        super(wheels);
    }
    @Override
    public void drive() {
        System.out.println("脚踏独轮车，摇摇摆摆往前走");
    }
}
