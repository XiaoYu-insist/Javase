package com.xiao.domain;

/**
 * ClassName: Employee
 * Package: com.xiao.domain
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 14:13
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMessage(){
        return this.id+"\t"+this.name+'\t'+this.age+'\t'+salary;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
