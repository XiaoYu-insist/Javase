package com.xiao.Further5;

/**
 * ClassName: AccountTest
 * Package: com.xiao.Further5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 9:53
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的账户余额为："+account.getBalance());
        System.out.println("月利率为："+account.getMonthlylnterest());
    }
}
