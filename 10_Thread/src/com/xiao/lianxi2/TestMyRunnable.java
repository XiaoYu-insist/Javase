package com.xiao.lianxi2;

/**
 * ClassName: TestMyRunnable
 * Package: com.xiao.lianxi2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 10:02
 * @Version 1.0
 */
public class TestMyRunnable {
    public static void main(String[] args) {
//        创建自定义对象
//     MyRunnable mr = new MyRunnable();
////     创建线程对象
//        Thread t = new Thread(mr,"什么");
//        t.start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("没"+i);
//        }

        new Thread("新线程1"){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName()+" "+i);
                }
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                Thread.currentThread().setName("Runnable线程2");
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        }).start();
    }
}
