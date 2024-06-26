package com.xiao.lianxi3_3;

/**
 * ClassName: Customer
 * Package: com.xiao.lianxi3_3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/6/26 20:15
 * @Version 1.0
 */
public class Customer extends Thread {
    Account account;

    public Customer(Account acct) {
        this.account = acct;
    }

    public Customer(Account acct, String name) {
        super(name);
        this.account = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}
