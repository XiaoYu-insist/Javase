package com.xiao.Study5;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.xiao.Study5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 14:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();

        System.out.println("请输入月份");
        int monthvalue = input.nextInt();
        Month month = Month.getByValue(monthvalue);
        System.out.println(month);
        System.out.println("月份总天数："+month.length(year%4==0&&year%100!=0||year%400==0));
        input.close();
    }
}
