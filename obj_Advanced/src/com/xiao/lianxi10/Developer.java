package com.xiao.lianxi10;

/**
 * ClassName: Developer
 * Package: com.xiao.lianxi10
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:44
 * @Version 1.0
 */
public class Developer extends Employee{
    private int workExperiences;

    public Developer(String name, int age, int workExperiences) {
        super(name, age);
        this.workExperiences = workExperiences;
    }

    @Override
    public void work() {
        System.out.println("开发");
    }

    @Override
    public double calMoney(int days) {
        return workExperiences * days;
    }
}
