package com.xiao.lianxi7;

public class PrintOddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("奇数线程：" + i);
        }
    }
}
