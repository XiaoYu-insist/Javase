package com.xiao.lianxi11;

public class Test01{
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("hello");
            }
        }.test();
    }
}
