package com.xiao.lianxi2_1;

/**
 * ClassName: Runnablenew
 * Package: com.xiao.lianxi2_1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 10:32
 * @Version 1.0
 */
public class Runnablenew implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "" + i);
            }
        }
    }
}
