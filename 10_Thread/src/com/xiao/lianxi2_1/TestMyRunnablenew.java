package com.xiao.lianxi2_1;

/**
 * ClassName: TestMyRunnablenew
 * Package: com.xiao.lianxi2_1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 10:31
 * @Version 1.0
 */
public class TestMyRunnablenew {
    public static void main(String[] args) {
//        创建线程
//        Runnablenew rt1 = new Runnablenew();
//        Thread t1 = new Thread(rt1,"奇数");
//        t1.start();
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0){
//                System.out.println("偶数"+i);
//            }
//        }
//        Thread t2 = new Thread(rt1,"有");

//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println("偶数" + i);
//                    }
//                }
//            }
//        }.start();
//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if (i % 2 != 0) {
//                        System.out.println("奇数" + i);
//                    }
//                }
//            }
//        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println("偶数" + i);
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println("奇数" + i);
                    }
                }
            }
        }).start();
    }
}
