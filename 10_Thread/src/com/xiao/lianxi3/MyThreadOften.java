package com.xiao.lianxi3;

/**
 * ClassName: MyThreadOften
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 15:40
 * @Version 1.0
 */
public class MyThreadOften extends Thread{

    public MyThreadOften() {
        super();
    }

    public MyThreadOften(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
