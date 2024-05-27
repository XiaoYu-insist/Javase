package com.xiao.Further2;

/**
 * ClassName: Customer
 * Package: com.xiao.Further2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 9:58
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
}
