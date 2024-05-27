package com.xiao.Practice3;

/**
 * ClassName: Main
 * Package: com.xiao.Practice3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:25
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        MyInt myInt1 = new MyInt();
        myInt1.value = 8;
        System.out.println("myInt1是" + myInt1.value);
        System.out.println("myInt1是自然数吗：" + myInt1.isNatural());
        System.out.println("myInt1的约数个数：" + myInt1.approximateNumberCount());
        System.out.println("myInt1是素数吗：" + myInt1.isPrimeNumber());
        int[] allPrimeNumber = myInt1.getAllApproximateNumber();
        System.out.println("myInt1的所有约数有：");
        for (int i = 0; i < allPrimeNumber.length; i++) {
            System.out.println(allPrimeNumber[i]);
        }

        System.out.println("------------------------------------------");
        MyInt myInt2 = new MyInt();
        myInt2.value = 11;
        System.out.println("myInt2是" + myInt2.value);
        System.out.println("myInt2是自然数吗：" + myInt2.isNatural());
        System.out.println("myInt2的约数个数：" + myInt2.approximateNumberCount());
        System.out.println("myInt2是素数吗：" + myInt2.isPrimeNumber());
        allPrimeNumber = myInt2.getAllApproximateNumber();
        System.out.println("myInt2的所有约数有：");
        for (int i = 0; i < allPrimeNumber.length; i++) {
            System.out.println(allPrimeNumber[i]);
        }

    }
}
