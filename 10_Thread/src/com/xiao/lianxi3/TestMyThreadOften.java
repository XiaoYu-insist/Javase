package com.xiao.lianxi3;

/**
 * ClassName: TestMyThreadOften
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 15:44
 * @Version 1.0
 */
public class TestMyThreadOften {
    public static void main(String[] args) {
        MyThreadOften my = new MyThreadOften("my");
        my.currentThread().setName("子程序1");
//        System.out.println("优先级："+my.getPriority());
        my.yield();
        my.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main:" + i);
            if (i == 20) {
                try {
                    my.join(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
