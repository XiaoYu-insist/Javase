package com.xiao.lianxi6;

import com.xiao.lianxi6.ChatThread;

public class Exercise3 {
    public static void main(String[] args) {
        for(int i = 1;i <= 10;i++){
            System.out.println("main:"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==5){
                ChatThread t =new ChatThread();
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
