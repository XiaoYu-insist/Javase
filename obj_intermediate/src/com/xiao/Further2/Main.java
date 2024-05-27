package com.xiao.Further2;

/**
 * ClassName: Main
 * Package: com.xiao.Further2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 10:04
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("什","么");
        bank.addCustomer("什","它");
        bank.getCustomers(0).setAccount(new Account(1000));
        bank.getCustomers(0).getAccount().withdraw(20);
        bank.getCustomers(0).getAccount().deposit(500);
        bank.getCustomers(1).setAccount(new Account(200));
        System.out.println(bank.getCustomers(1).getAccount().getBalance());
    }
}
