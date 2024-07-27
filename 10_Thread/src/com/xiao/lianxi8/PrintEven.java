package com.xiao.lianxi8;

public class PrintEven extends Thread{
    private int num = 2;
    @Override
    public void run() {
        while (num <= 100){
            synchronized(Thread.class){
                for (int i = 0; i < 5; i++) {
                    System.out.println("偶数为:"+num);
                    num+=2;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
