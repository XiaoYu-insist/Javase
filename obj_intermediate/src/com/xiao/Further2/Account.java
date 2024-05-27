package com.xiao.Further2;

/**
 * ClassName: Account
 * Package: com.xiao.Further2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:56
 * @Version 1.0
 */
public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("存钱成功，余额："+balance);
    }

    public void withdraw(double amount) {
        if (amount < balance){
            balance -= amount;
            System.out.println("取出"+amount+",还剩"+balance);
        }else {
            System.out.println("余额不够");
        }
    }
}
