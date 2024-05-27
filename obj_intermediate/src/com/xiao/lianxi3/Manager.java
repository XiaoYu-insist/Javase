package com.xiao.lianxi3;

/**
 * ClassName: Manager
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/23 16:35
 * @Version 1.0
 */
public class Manager extends SalaryEmployee {
    private double bonusRate;
    public Manager(String name,double salary,MyDate birthday,double bonusRate) {
        super(name,salary,birthday);
        this.bonusRate = bonusRate;
    }
    public Manager(String name,double salary,int year,int month,int day,double bonusRate) {
        super(name,salary,year,month,day);
        this.bonusRate = bonusRate;
    }

    @Override
    public double earing() {
        return super.earing() * (1*bonusRate);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"奖金比例："+bonusRate;
    }
}
