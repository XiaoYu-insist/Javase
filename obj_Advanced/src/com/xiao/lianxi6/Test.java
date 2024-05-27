package com.xiao.lianxi6;

/**
 * ClassName: Test
 * Package: com.xiao.lianxi6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/10 16:53
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Chinese();
        p[1] = new American();
        p[2] = new Indian();

        for (int i = 0; i < p.length; i++) {
            p[i].eat();
        }
    }
}
