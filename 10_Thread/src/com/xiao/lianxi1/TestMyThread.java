package com.xiao.lianxi1;

/**
 * ClassName: TestMyThread
 * Package: lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 9:46
 * @Version 1.0
 */
public class TestMyThread {
    public static void main(String[] args) {
        //创建自定义线程对象1
        MyTHread mt1 = new MyTHread("子线程1");
        mt1.start();

        //创建自定义线程对象2
        MyTHread mt2 = new MyTHread("子线程2");
        mt2.start();

        //main方法中执行for循环
        for (int i = 0; i < 50; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
