package com.xiao.lianxi9;

/**
 * ClassName: Employee
 * Package: com.xiao.lianxi9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:13
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee={"
                + "姓名" + this.name
                + "，工号" + this.id
                + "，工资" + this.salary
                + "}";
    }
}
