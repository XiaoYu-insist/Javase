package com.xiao.Further5;

/**
 * ClassName: CheckAccount
 * Package: com.xiao.Further5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:00
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annuallnterestRate){
        super(id, balance, annuallnterestRate);
    }

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() >= amount){
            super.withdraw(amount);
        }else if(getBalance()+overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("超过可透支限额");
        }
    }
}
