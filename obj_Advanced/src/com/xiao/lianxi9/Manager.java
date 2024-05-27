package com.xiao.lianxi9;

/**
 * ClassName: Manager
 * Package: com.xiao.lianxi9
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/11 15:15
 * @Version 1.0
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理");
    }

    @Override
    public String toString() {
        return super.toString()+"，奖金"+this.bonus;
    }
}
