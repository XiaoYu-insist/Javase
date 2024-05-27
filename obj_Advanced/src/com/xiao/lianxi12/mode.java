package com.xiao.lianxi12;

import org.junit.Test;

/**
 * ClassName: mode
 * Package: com.xiao.lianxi12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/17 10:04
 * @Version 1.0
 */
public class mode {
    @Test
    public void test(){
        Integer i1 = 128;
        Integer i2 = 128;
        int i3 = 128;
        int i4 = 128;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i1 == i3);
        System.out.println(i2 == i4);
    }
    @Test
    public void test2(){
        Integer i1 = 128;
        Integer i2 = 128;
        int i3 = 128;
        int i4 = 128;
        System.out.println(i1 == i2);//false，比较地址，128超过Integer缓存对象
        System.out.println(i3 == i4);//true，比较数据值
        System.out.println(i1 == i3);//true，i1自动拆箱按照基本数据类型比较
        //包装类对象与基本数据类型进行比较时，就会把包装类对象自动拆箱，按照基本数据类型的规则进行比较
        System.out.println(i4 == i2);
    }

    @Test
    public void test3(){
        double a = 2.0;
        double b = 2.0;
        Double c = 2.0;
        Double d = 2.0;
//        System.out.println(a == b);
//        System.out.println(c == d);
//        System.out.println(a == d);
        Integer m = -129;
        Integer n = -129;
        System.out.println(m == n);

    }
}
