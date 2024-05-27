package com.xiao.Basics1;

/**
 * ClassName: main
 * Package: com.xiao.Basics1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/16 14:00
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {
//        创建对象
        dingylei dingylei = new dingylei(1,"你好");
        dingylei.eat();
//        不定义对象直接调用方法，叫做匿名方法
        new dingylei().eat();
    }
}