package com.xiao.lianxi4;

/**
 * ClassName: Architect
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/24 9:30
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;
    public Architect(){}
    public Architect(int id, String name, int age, double salary, double bonus, int stock){
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getInfo() {
        return super.say()+"\t\t架构师："+"\t"+getBonus()+"\t"+stock;
    }
}
