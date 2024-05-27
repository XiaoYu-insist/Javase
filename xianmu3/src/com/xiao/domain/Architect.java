package com.xiao.domain;

/**
 * ClassName: Architect
 * Package: com.xiao.domain
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 14:22
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMessageArchitect() {
        return getMemberDetails()+"\t架构师\t"+getBonus()+'\t'+getStock();
    }

    @Override
    public String toString() {
        return getMessage()+'\t'+getStatus()+"\t架构师\t"+getBonus()+'\t'+getStock()+'\t'+getEquipment().getDescription();
    }
}
