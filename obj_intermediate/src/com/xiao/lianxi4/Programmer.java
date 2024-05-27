package com.xiao.lianxi4;

/**
 * ClassName: Programmer
 * Package: com.xiao.lianxi4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/24 8:53
 * @Version 1.0
 */
public class Programmer extends Employee{
    public Programmer(){}
    public Programmer(int id, String name,int age, double salary){
        super(id, name, age, salary);
    }

    @Override
    public String getInfo() {
        return super.say()+"\t\t程序员";
    }
}
