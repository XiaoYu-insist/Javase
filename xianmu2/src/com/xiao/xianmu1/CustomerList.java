package com.xiao.xianmu1;

/**
 * ClassName: CustomerList
 * Package: com.xiao.xianmu1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/19 10:46
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total;

    /**
     *构造器，用来初始化customers数组
     * @param totalCustomer:指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     *用途：将参数customer添加组中最后一个客户对象记录之后
     * @param customer customer指定要添加的客户对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 用途：用参数customer替换数组中由index指定的对象
     * @param index index指定所替换对象在数组中的位置，从0开始
     * @param cust 参数：customer指定替换的新客户对象
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 用途：从数组中删除参数index指定索引位置的客户对象记录
     * @param index index指定所删除对象在数组中的索引位置，从0开始
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 用途：返回数组中记录的所有客户对象
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     */
    public Customer[] getAllCustomers(){
        Customer[] cust = new Customer[total];
        for(int i = 0; i < total; i++){
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * 用途：返回参数index指定索引位置的客户对象记录
     * @param index index指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 返回用户个数
     * @return 用户共有多少
     */
    public int getTotal(){
        return total;
    }

}
