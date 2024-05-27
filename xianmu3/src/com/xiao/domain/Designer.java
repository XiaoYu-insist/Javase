package com.xiao.domain;

/**
 * ClassName: Designer
 * Package: com.xiao.domain
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 14:20
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getMessageDesigner(){
        return getMemberDetails()+"\t设计师\t"+getBonus();
    }

    @Override
    public String toString() {
        return getMessage()+'\t'+getStatus()+"\t设计师\t"+getBonus()+"\t\t\t"
                +getEquipment().getDescription();
    }
}
