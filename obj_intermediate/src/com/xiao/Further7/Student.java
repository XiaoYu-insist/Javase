package com.xiao.Further7;

/**
 * ClassName: Student
 * Package: com.xiao.Further7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 15:59
 * @Version 1.0
 */
public class Student extends Person{
    protected String school="pku";
    @Override
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
