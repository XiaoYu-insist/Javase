package com.xiao.Study12;

/**
 * ClassName: Designer
 * Package: com.xiao.Study12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/18 10:02
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bouns;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bouns) {
        super(id, name, age, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public String toString() {
        return super.getBasiclnfo() + "\t\t设计师" + "\t" + getBouns();
    }
}
