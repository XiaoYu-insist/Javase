package com.xiao.lianxi3_3_2;

import com.xiao.lianxi3_3.Account;

/**
 * ClassName: Customer
 * Package: com.xiao.lianxi3_3_2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/6/26 20:34
 * @Version 1.0
 */
public class Customer implements Runnable {
    private double balance;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            deposit(1000);
        }
    }

    public void deposit(double amt) {
        if (amt > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amt;
        }
        System.out.println(Thread.currentThread().getName() + "充值1000后,余额为：" + balance);
    }
}
