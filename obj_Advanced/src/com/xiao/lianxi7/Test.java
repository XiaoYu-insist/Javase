package com.xiao.lianxi7;

/**
 * ClassName: Test
 * Package: com.xiao.lianxi7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/10 22:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];

        arr[0] = new Rectangle(2,3);
        arr[1] = new Rectangle(3,6);
        arr[2]  = new Triangle(3,4,5);
        arr[3]  = new Triangle(6,6,6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
