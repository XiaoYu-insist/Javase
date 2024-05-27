package com.xiao.Study10;

/**
 * ClassName: Test
 * Package: com.xiao.Study10
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 16:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Payment[] values = Payment.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].pay();
        }
    }
}
