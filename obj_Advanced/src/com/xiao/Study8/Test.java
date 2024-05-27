package com.xiao.Study8;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 15:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int m = input.nextInt();
        Month month = Month.getByValue(m);
        System.out.println(month);
        input.close();
    }
}
