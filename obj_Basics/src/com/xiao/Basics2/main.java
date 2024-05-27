package com.xiao.Basics2;

/**
 * ClassName: main
 * Package: com.xiao.Basics2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/16 16:35
 * @Version 1.0
 */
//System.out.println()方法就是典型的重载方法，其内部的声明形式如下：


public class main{
    public static void main(String[] args) {
//        System.out.println(3);
//        System.out.println(1.2f);
//        System.out.println("hello!");
        chongzai chongzai = new chongzai();
        chongzai.mOL(1);
        chongzai.mOL(2,3);
        chongzai.mOL("?");
        chongzai.max(1,2);
        chongzai.max(1.5,1.3);
        chongzai.max(1.5,1.3,6.2);
    }
}
