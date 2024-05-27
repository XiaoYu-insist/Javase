package com.xiao.Study2;

/**
 * ClassName: Test
 * Package: com.xiao.Study2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 10:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Thread("我"){
            @Override
            public void run() {
                System.out.println(getName()+"加油");
            }
        }.run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("加油是坚持");
            }
        }).run();
    }
}
