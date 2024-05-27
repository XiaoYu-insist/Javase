package com.xiao.lianxi3;

/**
 * ClassName: SalaryEmployee
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/22 16:13
 * @Version 1.0
 */
public class SalaryEmployee extends Employee{
    private double salary;
    private MyDate birthday;

    public SalaryEmployee(String name, double salary, MyDate birthday) {
        super(name);
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public double earing() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"生日："+birthday.getInfo();
    }

    public SalaryEmployee(String name, double salary, int year, int month , int day){
        super(name);
        this.salary = salary;
        this.birthday = new MyDate(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
