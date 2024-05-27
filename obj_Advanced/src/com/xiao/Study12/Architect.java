package com.xiao.Study12;

/**
 * ClassName: Architect
 * Package: com.xiao.Study12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/18 10:05
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bouns, int stock) {
        super(id, name, age, salary, bouns);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.getBasiclnfo() + "\t\t架构师" + "\t" + getBouns() + "\t" + getStock();
    }
}
