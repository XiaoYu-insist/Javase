package com.xiao.Study7;

/**
 * ClassName: Account
 * Package: com.xiao.Study7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:28
 * @Version 1.0
 */
public class Account {
    private String id;
    private double balance;

    public Account() {
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double money) throws Exception {
        if (money < 0){
            throw new Exception("取钱金额错误");
        }
        if (money > getBalance()){
            throw new Exception("取款金额不足，不支持当前取款操作");
        }
        balance -= money;
    }

    public void save(double money) throws Exception{
        if (money < 0){
            throw new Exception("存钱请输入正确的数字");
        }
        balance += money;
    }
}
