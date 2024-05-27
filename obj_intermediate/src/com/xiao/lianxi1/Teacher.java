package com.xiao.lianxi1;

/**
 * ClassName: Teacher
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:27
 * @Version 1.0
 */
public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, char gender,  double salary) {
        super(gender, age, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "姓名："+getName() + "，年龄：" + getAge() + "，性别：" + getGender()+"，薪资"+getSalary();
    }
}
