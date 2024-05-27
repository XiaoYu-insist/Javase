package com.xiao.lianxi1;

/**
 * ClassName: Main
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 15:55
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Account a1 = new Account("1111",1000.0);
        Account a2 = new Account("2222",2000.0);
        Account.setRate(0.035);
        System.out.println(a1);
        System.out.println(a2);
    }
}
