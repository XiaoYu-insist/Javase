package com.xiao.Further2;

/**
 * ClassName: Bank
 * Package: com.xiao.Further2
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 10:01
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numOfCustomer;
    public Bank() {
        customers = new Customer[10];
    }
    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numOfCustomer] = customer;
        numOfCustomer++;
    }

    public int getNumOfCustomer() {
        return numOfCustomer;
    }

    public Customer getCustomers(int index) {
        if (index < 0 || index >= numOfCustomer){
            return null;
        }
        return customers[index];
    }
}
