package com.xiao.lianxi3_3;

/**
 * ClassName: AccountTest
 * Package: com.xiao.lianxi3_3
 * Description:
 *      使用 继承Thread方法使用
 * @Author xiao-yu
 * @Create 2024/6/26 20:15
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acco =  new Account();
        Customer customer1 = new Customer(acco,"甲");
        Customer customer2 = new Customer(acco,"乙");
        customer1.start();
        customer2.start();

    }
}
