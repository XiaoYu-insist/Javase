package com.xiao.lianxi3_3;

/**
 * ClassName: Account
 * Package: com.xiao.lianxi3_3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/6/26 20:15
 * @Version 1.0
 */
public class Account {
    double balance;
    public synchronized void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"存钱1000快，余额为："+balance);
    }
}
