package com.xiao.lianxi2;

/**
 * ClassName: MyRunnable
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 10:01
 * @Version 1.0
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
}
