package com.xiao.lianxi10;

/**
 * ClassName: Employee
 * Package: com.xiao.lianxi10
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:33
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public abstract double calMoney(int days);
}
