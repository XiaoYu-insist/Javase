package com.xiao.Study12;

/**
 * ClassName: Employee
 * Package: com.xiao.Study12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/18 9:52
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;// : 姓名
    private int age;// : 年龄
    private double salary;// : 工资

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

    public String getBasiclnfo(){
        return  id + "\t\t" + name + "\t" + age + "\t\t" + salary;
    }

    @Override
    public String toString() {
        return getBasiclnfo();
    }


}
