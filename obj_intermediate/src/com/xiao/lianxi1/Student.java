package com.xiao.lianxi1;

/**
 * ClassName: Student
 * Package: com.xiao.lianxi1
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/4/20 10:23
 * @Version 1.0
 */
public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(String name,int age, char gender,double score) {
        super(gender, age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getInfo(){
        return "姓名："+getName() + "，年龄：" + getAge() + "，性别：" + getGender()+"，成绩"+getScore();
    }
}
