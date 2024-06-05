package com.xiao.lianxi3_2;

/**
 * ClassName: TestThreadStateChange
 * Package: com.xiao.lianxi3_2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 16:13
 * @Version 1.0
 */
public class TestThreadStateChange {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 2; i < 100; i+=2) {
                    System.out.println("偶数："+i);
                    try{
                        sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i+=2) {
                    System.out.println("奇数:"+ i);
                    if (i==5){
                        try{
                            this.join();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }
}
