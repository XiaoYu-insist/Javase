package com.xiao.Study12;

/**
 * ClassName: Programmer
 * Package: com.xiao.Study12
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/18 10:00
 * @Version 1.0
 */
public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public String toString() {
        return super.getBasiclnfo()+"\t\t程序员";
    }
}
