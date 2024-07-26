package com.xiao.lianxi4;

public class test {
    public static void main(String[] args) {
        Communication communication =  new Communication();
        Thread t1 =  new Thread(communication,"线程1");
        Thread t2 =  new Thread(communication,"线程2");
        t1.start();
        t2.start();
    }
}
