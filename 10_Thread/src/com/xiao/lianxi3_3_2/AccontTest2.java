package com.xiao.lianxi3_3_2;

/**
 * ClassName: AccontTest2
 * Package: com.xiao.lianxi3_3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/6/26 20:34
 * @Version 1.0
 */
public class AccontTest2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Thread t1 = new Thread(customer,"甲");
        Thread t2 = new Thread(customer,"乙");
        t1.start();
        t2.start();
    }
}
