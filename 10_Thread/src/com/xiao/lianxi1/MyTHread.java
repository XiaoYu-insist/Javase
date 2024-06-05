package com.xiao.lianxi1;

/**
 * ClassName: MyTHread
 * Package: lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/29 9:47
 * @Version 1.0
 */
public class MyTHread extends Thread {
    public MyTHread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++){
            System.out.println(getName()+":正在执行！"+i);
        }
    }
}
