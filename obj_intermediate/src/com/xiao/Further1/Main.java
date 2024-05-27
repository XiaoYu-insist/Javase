package com.xiao.Further1;

/**
 * ClassName: Main
 * Package: com.xiao.Further1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy("你好",20);
        Girl girl = new Girl("不好",21);
        girl.marry(boy);

    }
}
