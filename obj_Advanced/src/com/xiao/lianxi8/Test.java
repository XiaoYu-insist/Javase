package com.xiao.lianxi8;

/**
 * ClassName: Test
 * Package: com.xiao.lianxi8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 14:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Monocycle(1);
        arr[1] = new Bicycle(2);
        arr[2] = new Tricycle(3);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i].drive();
        }

    }
}
