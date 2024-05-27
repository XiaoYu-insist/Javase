package com.xiao.Study9;

/**
 * ClassName: Test
 * Package: com.xiao.Study9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 15:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Payment[] p = Payment.values();
        for (int i = 0; i < p.length;i++){
            System.out.println(p[i]+":");
            p[i].pay();
        }
    }
}
