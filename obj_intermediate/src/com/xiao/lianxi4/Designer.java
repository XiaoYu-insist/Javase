package com.xiao.lianxi4;

/**
 * ClassName: Designer
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/24 8:56
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;
    public Designer() {};
    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.say() + "\t\t设计师" + "\t" + bonus;
    }
}
