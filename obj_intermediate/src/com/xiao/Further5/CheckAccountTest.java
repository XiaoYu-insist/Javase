package com.xiao.Further5;

/**
 * ClassName: CheckAccountTest
 * Package: com.xiao.Further5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:11
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println("账户余额为："+checkAccount.getBalance());
        System.out.println("可透支的余额为："+checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("账户余额为："+checkAccount.getBalance());
        System.out.println("可透支的余额为："+checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("账户余额为："+checkAccount.getBalance());
        System.out.println("可透支的余额为："+checkAccount.getOverdraft());
    }
}
