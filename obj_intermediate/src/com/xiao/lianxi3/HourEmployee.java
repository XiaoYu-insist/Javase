package com.xiao.lianxi3;

/**
 * ClassName: HourEmployee
 * Package: com.xiao.lianxi3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/23 16:27
 * @Version 1.0
 */
public class HourEmployee extends Employee{
    private double hour;
    private double moneyPerHour;
    public HourEmployee(String name,double moneyPerHour){
        super(name);
        this.moneyPerHour = moneyPerHour;
    }
    public  HourEmployee(String name,double hour,double moneyPerHour){
        super(name);
        this.hour = hour;
        this.moneyPerHour = moneyPerHour;
    }

    @Override
    public double earing() {
        return hour*moneyPerHour;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"时薪："+moneyPerHour+"工作小时："+hour;
    }
}
