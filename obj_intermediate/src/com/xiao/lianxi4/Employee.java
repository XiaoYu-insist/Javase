package com.xiao.lianxi4;

/**
 * ClassName: Employee
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/24 8:49
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

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

    public String say(){
        return id + "\t\t" + name + "\t" + age + "\t\t" + salary;
    }

    public String getInfo(){
        return say();
    }
}
