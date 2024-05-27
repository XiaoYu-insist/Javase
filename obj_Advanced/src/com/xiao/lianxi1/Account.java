package com.xiao.lianxi1;

/**
 * ClassName: Account
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/26 15:51
 * @Version 1.0
 */
public class Account {
    private static double rate;
    private String id;
    private double balance;

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double annualInterest(){
        return balance * rate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", 年利息" + annualInterest() +
                '}';
    }
}
