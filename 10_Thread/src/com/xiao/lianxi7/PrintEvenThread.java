package com.xiao.lianxi7;

public class PrintEvenThread extends Thread {
    private Boolean flag = true;

    @Override
    public void run() {
        for (int i = 2; i <= 100 && flag; i += 2) {
            System.out.println("偶数为:" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
