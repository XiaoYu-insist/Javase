package com.xiao.lianxi5;

/**
 * ClassName: Test
 * Package: com.xiao.lianxi5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/10 16:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        p[0] = new Man();
        p[1] = new Woman();
        for (int i = 0; i < p.length; i++){
            p[i].pee();
        }
    }
}
