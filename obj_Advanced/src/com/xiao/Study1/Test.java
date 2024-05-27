package com.xiao.Study1;

/**
 * ClassName: Test
 * Package: com.xiao.Study1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 10:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Object(){
            public void print(){
                System.out.println("hello");
            }
        }.print();
    }
}
