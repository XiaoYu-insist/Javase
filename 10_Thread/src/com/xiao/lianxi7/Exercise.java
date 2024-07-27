package com.xiao.lianxi7;

public class Exercise {
    public static void main(String[] args) {
        PrintEvenThread pe = new PrintEvenThread();
        PrintOddThread po = new PrintOddThread();
        pe.start();
        po.start();

        try {
            po.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pe.setFlag(false);
    }
}
