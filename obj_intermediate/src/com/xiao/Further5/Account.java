package com.xiao.Further5;

/**
 * ClassName: Account
 * Package: com.xiao.Further5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 9:44
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    /**
     * 获取月率
     * @return
     */
    public double getMonthlylnterest() {
        return annuallnterestRate / 12;
    }

    /**
     * 取钱
     * @param amount 要取得钱数
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("余额不足");
        }
    }

    /**
     * 存钱
     * @param amount 存的余额
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
